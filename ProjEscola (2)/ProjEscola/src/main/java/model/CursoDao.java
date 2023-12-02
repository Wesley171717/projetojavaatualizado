package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Conexao;

public class CursoDao {
	Connection con;
	ResultSet rs;
	
	
	public CursoDao() {
		
		con = new Conexao().conectar();
		
	}
	
	
	public void Salvar(Curso cur) {
		try {
			
			String sql = "insert into  curso(idcurso, nomecurso, cargahoraria, tipocurso)values(?,?,?,?,)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, cur.getIdcurso());
			stmt.setString(2, cur.getNomecurso());			
			stmt.setInt(3, cur.getCargahoraria());
			stmt.setString(4, cur.getTipocurso());
		}
		catch(Exception erro) {
			
		}
		
	}
	
	
	public ArrayList<Curso>listar()	{
		try {
			con = new Conexao().conectar();
			
			ArrayList<Curso> Curso = new ArrayList<>();
			String sql = "select * from curso";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int idcurso = rs.getInt("idcurso");
				String nomecurso = rs.getString("noecurso");
				int cargahoraria = rs.getInt("cargahoraria");
				String tipocurso = rs.getString("tipocurso");
				
				
				Curso.add(new Curso(idcurso,nomecurso,cargahoraria, tipocurso));
			}
			
			return Curso;
			
		}
		catch(Exception erro) {
			System.out.println(erro);
			return null;
		}
		
	}
	

}
