package ar.edu.unlam.pb2.Dominio;

import java.util.HashSet;
import java.util.Set;

public class Consumidor implements Comparable<Consumidor> {

	private Integer dni;
	private String nombre;
	private Set<MedioDePago> mediosDePago;

	public Consumidor(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.mediosDePago = new HashSet<>();
	}

	public Integer getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Consumidor o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}

	public void agregarMedioDePago(MedioDePago nuevo) {
		this.mediosDePago.add(nuevo);
	}

	//REHACER PERO MEJOR
	public MedioDePago getMedioPagador(String identificadorDelMedioDePago) {

		for (MedioDePago actual : mediosDePago) {
			// InstanceOF me dice como se declaro un objeto
			if (actual instanceof Tarjeta) {
				Long numero = Long.parseLong(identificadorDelMedioDePago);
				if (((Tarjeta) actual).getNumero().equals(numero)) {
					return actual;
				}
			} else {
				if (actual instanceof CuentaBancaria) {
					if (((CuentaBancaria) actual).getNumero().equals(identificadorDelMedioDePago)) {
						return actual;
					}
				} else {
					if (((CuentaVirtual) actual).getNumero().equals(identificadorDelMedioDePago)) {
						return actual;
					}
				}
			}
		}
		return null;
	}

}
