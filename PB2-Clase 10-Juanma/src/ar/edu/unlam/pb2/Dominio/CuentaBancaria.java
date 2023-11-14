package ar.edu.unlam.pb2.Dominio;

import java.util.Objects;

public class CuentaBancaria extends Cuenta implements Transferible {

	private String cbu;

	public CuentaBancaria(String cbu, String entidad, String titular) throws CBUInvalidoException {
		setCbu(cbu);
		this.entidad=entidad;
		this.titular=titular;
		this.saldo=0.0;
	}

	private void setCbu(String cbu) throws CBUInvalidoException {
		if(cbu.length()!=20) {
			throw new CBUInvalidoException();
		}
		this.cbu=cbu;
	}

	@Override
	public String getCbu() {
		// TODO Auto-generated method stub
		return this.cbu;
	}

	@Override
	public String getNumero() {
		// TODO Auto-generated method stub
		return this.cbu;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(cbu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(cbu, other.cbu);
	}
	
	

}
