package ar.edu.unlam.pb2.Dominio;

public class Compra {

	private Long cuitDelComercio;
	private Double importeDeCompra;
	private Boolean pagada;

	public Compra(Long cuitDelComercio, Double importe) {
		this.cuitDelComercio=cuitDelComercio;
		this.importeDeCompra=importe;
		this.pagada=false;
	}

	public Long getCuitDelComercio() {
		return cuitDelComercio;
	}

	public Double getImporteDeCompra() {
		return importeDeCompra;
	}

	public void setCuitDelComercio(Long cuitDelComercio) {
		this.cuitDelComercio = cuitDelComercio;
	}

	public void setImporteDeCompra(Double importeDeCompra) {
		this.importeDeCompra = importeDeCompra;
	}

	public Boolean getPagada() {
		return pagada;
	}

	public void setPagada(Boolean pagada) {
		this.pagada = pagada;
	}
	
	
	
	

}
