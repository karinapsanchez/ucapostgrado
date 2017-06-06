package ar.edu.uca.objetos.primos;

public class Orden {

	
	protected String tipo = "asc";
	
	public Orden(String tipo){
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
