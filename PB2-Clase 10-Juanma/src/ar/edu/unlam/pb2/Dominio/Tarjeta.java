package ar.edu.unlam.pb2.Dominio;

import java.util.Objects;

public abstract  class Tarjeta extends MedioDePago{
	protected Long numero;
	protected String fecha;
	protected Integer codigo;
	protected Double saldo;
	
	public void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException {
		if(numero.toString().length()!=16) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		this.numero = numero;
	}
	
	public Long getNumero() {
		return numero;
	}

	public String getFechaDeVencimiento() {
		return fecha;
	}

	public Integer getCodigoDeSeguridad() {
		return codigo;
	}

	public abstract Double getSaldo();

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setCodigo(Integer codigo) {
		this.codigo=codigo;
	}
	
	public void setSaldo(Double d) {
		this.saldo=d;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(numero, other.numero);
	}
	
	
	
}
