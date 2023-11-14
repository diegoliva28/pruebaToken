package ar.edu.unlam.pb2.Dominio;

public class TarjetaDeDebito extends Tarjeta implements Pagadora {


	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		setNumero(numero);
		setTitular(titular);;
		setFecha(fechaDeVencimiento);;
		setCodigo(codigoDeSeguridad);;
		this.saldo=0.0;
	}
	
	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		return null;
	}


	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}
}
