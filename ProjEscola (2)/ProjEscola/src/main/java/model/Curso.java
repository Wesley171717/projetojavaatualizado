package model;

public class Curso {

	private int idcurso;
	private String nomecurso;
	private int cargahoraria;
	private String tipocurso;
	
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Curso(int idcurso, String nomecurso, int cargahoraria, String tipocurso) {
		super();
		this.idcurso = idcurso;
		this.nomecurso = nomecurso;
		this.cargahoraria = cargahoraria;
		this.tipocurso = tipocurso;
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public String getNomecurso() {
		return nomecurso;
	}
	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	public String getTipocurso() {
		return tipocurso;
	}
	public void setTipocurso(String tipocurso) {
		this.tipocurso = tipocurso;
	}
	
	
}

	