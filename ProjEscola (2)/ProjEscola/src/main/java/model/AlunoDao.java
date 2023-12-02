package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Conexao;

public class AlunoDao {
	
	Connection con;
	ResultSet rs;
	
	
	public AlunoDao() {
		
		con = new Conexao().conectar();
		
	}
	
	
	public void Salvar(Aluno alu) {
		try {
			
			String sql = "insert into aluno(nome,telefone,email,datanasc,cpf,rg,cep,numero,complemento)values(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, alu.getNome());
			stmt.setString(2, alu.getTelefone());			
			stmt.setString(3, alu.getEmail());
			stmt.setString(4, alu.getDatanasc());
			stmt.setString(5, alu.getCpf());
			stmt.setString(6, alu.getRg());
			stmt.setString(7, alu.getCep());
			stmt.setInt(8, alu.getNumero());
			stmt.setString(9, alu.getComplemento());
			stmt.executeUpdate();
			con.close();			
			
		}
		catch(Exception erro) {
			
		}
		
	}
	
	
	public ArrayList<Aluno>listar()	{
		try {
			con = new Conexao().conectar();
			
			ArrayList<Aluno> alunos = new ArrayList<>();
			String sql = "select * from aluno";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int idaluno = rs.getInt("idaluno");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				String email = rs.getString("email");
				String datanasc = rs.getString("datanasc");
				String cpf = rs.getString("cpf");
				String rg = rs.getString("rg");
				String cep = rs.getString("cep");
				int numero = rs.getInt("numero");
				String complemento = rs.getString("complemento");
				
				alunos.add(new Aluno(idaluno,nome,telefone,email,cpf,rg,cep,numero,complemento,datanasc));
			}
			
			return alunos;
			
		}
		catch(Exception erro) {
			System.out.println(erro);
			return null;
		}
		
	}
	

}
