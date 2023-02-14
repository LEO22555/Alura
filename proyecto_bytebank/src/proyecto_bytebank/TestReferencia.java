package proyecto_bytebank;

public class TestReferencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);
		System.out.println("Saldo segunda cuenta: " + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
	}

}
}