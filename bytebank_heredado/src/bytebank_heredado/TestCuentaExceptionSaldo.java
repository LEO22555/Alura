package bytebank_heredado;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123,456);
		cuenta.deposita(210);
		cuenta.sacar(210);
		//cuenta.sacar(110);
	}
		
}
