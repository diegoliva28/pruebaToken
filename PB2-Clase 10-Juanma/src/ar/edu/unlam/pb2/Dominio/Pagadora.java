package ar.edu.unlam.pb2.Dominio;

public interface Pagadora {

	Boolean pagar(Persona vendedor, Double importe);

	void setSaldo(Double d);

	Long getNumero();

	String getTitular();

	Integer getCodigoDeSeguridad();

	String getFechaDeVencimiento();

	Double getSaldo();

//	Double getLimiteDeCompraEnPesos();
//
//	Double getLimiteDeCompraEnDolares();

}
