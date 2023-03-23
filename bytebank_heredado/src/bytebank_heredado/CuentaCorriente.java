package bytebank_heredado;

public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.sacar(valor+comision);
	}

	@Override
	public void deposita(double valor) {		
	}
}
