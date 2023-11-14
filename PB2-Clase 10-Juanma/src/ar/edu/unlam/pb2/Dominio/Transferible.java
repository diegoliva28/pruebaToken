package ar.edu.unlam.pb2.Dominio;

public interface Transferible {
	String getNumero();

	String getCbu();

	String getEntidad();

	String getTitular();

	void depositar(Double importe);

}
