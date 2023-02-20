package proyecto_bytebank;

public class PruebaConstructor {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(555); // nuevas instancias
		Cuenta cuenta2 = new Cuenta(333);
		Cuenta cuenta3 = new Cuenta(444);
		
		System.out.println(Cuenta.total);
		System.out.println(Cuenta.numero);
		//System.out.println(cuenta.getAgencia());

	}

}
