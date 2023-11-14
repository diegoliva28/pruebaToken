package ar.edu.unlam.pb2.Dominio;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {

	private Double limiteEnPesos;
	private Double limiteEnDolares;

	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigoDeSeguridad, Double limiteDeCompraEnPesos, Double limiteDeCompraEnDolares) throws NumeroDeTarjetaInvalidoException {
		setNumero(numero);
		setTitular(titular);;
		setFecha(fechaDeVencimiento);;
		setCodigo(codigoDeSeguridad);;
		this.saldo=0.0;
		this.limiteEnPesos=limiteDeCompraEnPesos;
		this.limiteEnDolares=limiteDeCompraEnDolares;
	}

	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		setNumero(numero);
		setTitular(titular);;
		setFecha(fechaDeVencimiento);;
		setCodigo(codigoDeSeguridad);;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getLimiteDeCompraEnPesos() {
		// TODO Auto-generated method stub
		return this.limiteEnPesos;
	}

	public Double getLimiteDeCompraEnDolares() {
		// TODO Auto-generated method stub
		return this.limiteEnDolares;
	}

}
