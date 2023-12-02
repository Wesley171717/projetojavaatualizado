<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@page import = "model.Curso"%>
   <%@page import = "java.util.ArrayList"%>
   
    <!-- ALIMENTAR O OBJETO LISTA COM OS DADOS DA LISTA ALUNOS -->
    <%
    ArrayList<Curso> lista = (ArrayList<Curso>) request.getAttribute("Curso");
	%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>



    	<div class="row">
    	
			    	<table class="table table-dark">
			  <thead>
			    <tr>
			      <th scope="col">idcurso</th>
			      <th scope="col">nomecurso</th>
			      <th scope="col">cargahoraria</th>
			      <th scope="col">tipocurso</th>
			   
			    </tr>
			  </thead>
			  <tbody><!-- PREENCHER COM DADOS DA CLASSE/TABELA -->
			  	<% 
			  	 for(int i=0;i<lista.size();i++){		  	
			  	%>			  
			    <tr>
			      <td><%=lista.get(i).getIdcurso()%></td>			      
			      <td><%=lista.get(i).getNomecurso()%></td>
			      <td><%=lista.get(i).getCargahoraria()%></td>
			      <td><%=lista.get(i).getTipocurso()%></td>
			       			      
			    </tr>
			    
			    <% } %>
			   
			  </tbody>
			</table>
			    	
    </div>	

</body>
</html>