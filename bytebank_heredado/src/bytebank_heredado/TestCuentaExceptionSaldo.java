package bytebank_heredado;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123,456);
		cuenta.deposita(210);
		try {
			cuenta.sacar(10);
			cuenta.sacar(110);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
