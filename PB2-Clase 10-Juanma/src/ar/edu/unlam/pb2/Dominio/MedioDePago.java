package ar.edu.unlam.pb2.Dominio;

public abstract class MedioDePago {
	protected String titular;
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
}
