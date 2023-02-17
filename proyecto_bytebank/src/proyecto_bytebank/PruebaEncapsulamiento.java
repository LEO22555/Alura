package proyecto_bytebank;

public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Leo");
		cliente.setDocumento("123456");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cliente.getTitular());

	}

}
