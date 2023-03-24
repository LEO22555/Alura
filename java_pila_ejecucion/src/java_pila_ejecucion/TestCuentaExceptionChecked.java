package java_pila_ejecucion;

public class TestCuentaExceptionChecked {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		} catch (MiException e) {
			System.out.println("Excepcion atrapada");
			e.printStackTrace(); 
		}
	}
}
