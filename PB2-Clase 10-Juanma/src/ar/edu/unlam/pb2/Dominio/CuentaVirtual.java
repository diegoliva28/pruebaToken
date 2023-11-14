package ar.edu.unlam.pb2.Dominio;

import java.util.Objects;

public class CuentaVirtual extends Cuenta implements Transferible {

	private String cvu;
	
	public CuentaVirtual(String cvu, String entidad, String titular) throws CVUInvalidoException {
		setCvu(cvu);
		this.entidad=entidad;
		this.titular=titular;
		this.saldo=0.0;
	}
	
	private void setCvu(String cvu) throws CVUInvalidoException  {
		if(cvu.length()!=23) {
			throw new CVUInvalidoException();
		}
		this.cvu=cvu;
	}

	@Override
	public String getNumero() {
		// TODO Auto-generated method stub
		return this.cvu;
	}

	@Override
	public String getCbu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(cvu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaVirtual other = (CuentaVirtual) obj;
		return Objects.equals(cvu, other.cvu);
	}
	
	

}
