package proyecto_bytebank;

public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaDeLeo = new Cuenta();
		
		Cliente cliente = new Cliente();
		cuentaDeLeo.titular = cliente;
		cuentaDeLeo.titular= new Cliente();
		cuentaDeLeo.titular.nombre = "Leo";
	
		System.out.println(cuentaDeLeo.titular.nombre);
	
	}
}
