package ar.edu.unlam.pb2.Dominio;

public class Cuenta extends MedioDePago{

	protected String entidad;
//	protected String titular;
	protected Double saldo;
	
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
