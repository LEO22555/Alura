package proyecto_bytebank;

public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente leo = new Cliente();
		leo.titular = "Leonardo";
		leo.documento = "1263456";
		leo.telefono = "555555";
		
		Cuenta cuentaDeLeo = new Cuenta();
		cuentaDeLeo.agencia = 1;
		cuentaDeLeo.titular = leo;
		
		System.out.println(cuentaDeLeo.titular.documento);
		System.out.println(cuentaDeLeo.titular);
		System.out.println(leo);
	}
}
