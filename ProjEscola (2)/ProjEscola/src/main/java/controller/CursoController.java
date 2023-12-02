package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Curso;
import model.CursoDao;

/**
 * Servlet implementation class CursoController
 */
@WebServlet({"/CursoController","/cursonovo",})
public class CursoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CursoController() {
        super();
        // TODO Auto-generated constructor stub
    }

    Curso cur = new Curso();    
    CursoDao dao = new CursoDao();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
			String action = request.getServletPath();
		
			if(action.equals("/cursonovo")) {
			Salvar(request,response);
			}	
			if(action.equals("/Curso.jsp")) {
			Imprimir(request,response);
			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void Salvar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		cur.setIdcurso(Integer.parseInt(request.getParameter("idcurso")));
		cur.setNomecurso(request.getParameter("nome curso"));
		cur.setCargahoraria(Integer.parseInt(request.getParameter("carga horaria")));
		cur.setNomecurso(request.getParameter("tipo curso"));
		
		
		
		
		dao.Salvar(cur);
	

		PrintWriter pw=response.getWriter();
		pw.println("Curso Cadastrado!");
		
	}
	protected void Imprimir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//CHAMAR O DAO
		
		ArrayList<Curso> lista =  dao.listar();
		request.setAttribute("Curso", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("Curso.jsp");
		rd.forward(request, response);	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


		
	
	
}
