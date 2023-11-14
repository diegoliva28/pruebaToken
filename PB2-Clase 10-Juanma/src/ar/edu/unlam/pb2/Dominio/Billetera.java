package ar.edu.unlam.pb2.Dominio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class Billetera {

	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;
	private Map<MedioDePago, Integer> mediosDePago;
	
	private List<Compra> compras;

	public Billetera(String nombre) {
		this.nombre=nombre;
		this.comercios=new HashSet<Comercio>();
		this.consumidores=new TreeSet<>();
		this.mediosDePago=new HashMap<>();
		this.compras=new LinkedList<>();
	}

	public void agregarComercio(Comercio comercio) {
		comercios.add(comercio);
	}

	public Integer getCantidadDeComercios() {
		return comercios.size();
	}

	public void agregarConsumidor(Consumidor consumidor) {
		this.consumidores.add(consumidor);
	}

	public Integer getCantidadDeConsumidores() {
		return consumidores.size();
	}

	public void agregarMedioDePago(Integer dniDelConsumidro, MedioDePago nuevo)throws NoCoincideTitularException, DNIinvalidoException {
		Consumidor consumidor=this.buscarConsumidor(dniDelConsumidro);
		
		if(consumidor==null) {
			throw new DNIinvalidoException();
		}
		
		if(!consumidor.getNombre().equalsIgnoreCase(nuevo.getTitular())){ 
			throw new NoCoincideTitularException();
		}
		
		mediosDePago.put(nuevo, dniDelConsumidro);
	}

	private Consumidor buscarConsumidor(Integer dniDelConsumidro) {
		Consumidor buscado=null;
		
		for (Consumidor consumidor : consumidores) {
			if(consumidor.getDni().equals(dniDelConsumidro))
			buscado=consumidor;
		}
		
		return buscado;
	}

	public Integer getCantidadDeMediosDePago(Integer dni) {

		Integer cantidadDeMediosDePago=0;
		
//		COMO RECORRER UN MAP
//		FORMAP  MAP-->DATO TIPO ENTRY(PAREJAS)<>
		//Descompone al map y lo hace en parejas de clave/valor tipo entry
//		NOMBRE DE LA VARIABLE TIPO ENTRY
//		EL NOMBRE DE LA VARIABLE EN LA CLASE QUE PASA A SER UN SET ENTRY
		for (Map.Entry<MedioDePago, Integer> entry : mediosDePago.entrySet()) {
			//ESTRUCTURA PARA ACCEDER A LOS ATRIBUTOS DEL SET
			
//			MedioDePago key = entry.getKey();
//			keyType key = entry.getKey();
//			Tipo de dato de la clave
//			GETKEY(); me permite tener el clave del ENTRY SET
//			Integer val = entry.getValue();
//			Tipo de dato del valor del entry
//			GETVALUE(); me permite tener el valor del ENTRY SET
			
			if(dni.equals(entry.getValue())) {
				cantidadDeMediosDePago++;
			}
			
		}
		return cantidadDeMediosDePago;
	}

	public Compra generarCodigoQR(Long cuitDelComercio, Double importe) throws ComercioInexsistenteExcepcion {
		Comercio buscado=buscarComercio(cuitDelComercio);
		
		if(buscado==null) {
			throw new ComercioInexsistenteExcepcion();
		}
		Compra nueva=new Compra(cuitDelComercio, importe);
		this.compras.add(nueva);
		return nueva;
	}

	private Comercio buscarComercio(Long cuitDelComercio) {
		for (Comercio actual : comercios) {
			if(actual.getCuit().equals(cuitDelComercio)) {
				return actual;
			}
		}
		return null;
	}
//Hacerlo con el mapa
	public Consumidor getConsumidor(Integer dni) {
		// TODO Auto-generated method stub
		return this.buscarConsumidor(dni);
	}

	public Boolean pagar(Compra codigoQR, MedioDePago medioPagador) {
		for (Compra actual : compras) {
			if(actual==codigoQR) {
				//VALIDAR SI SE PUEDE PAGAR CON EL SALDO DEL MEDIO DEL PAGO
				//ACTUALIZAR SALDO EN CUENTAS
				codigoQR.setPagada(true);
				return true;
			}
		}
		
		return false;
	}


	

}
