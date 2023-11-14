package ar.edu.unlam.pb2.Dominio;

import java.util.Objects;

public class Comercio {

	private Long cuit;
	private String nombre;

	public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
		setCuit(cuit);
		this.nombre=nombre;
	}

	public void setCuit(Long cuit) throws CuitInvalidoException {
		if(cuit.toString().length()!=11 || cuit.toString().substring(0, 2)=="30") {
			//La condicion me valida que arranque con 30 si o si
			throw new CuitInvalidoException();
		}
		this.cuit = cuit;
	}
	
	public Long getCuit() {
		return cuit;
	}

	public String getNombre() {
		return nombre;
	}

//	public void setCuit(Long cuit) {
//		this.cuit = cuit;
//	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuit, other.cuit);
	}
	
	

}
