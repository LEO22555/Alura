package proyecto_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		//metodo depositar
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		
		//metodo retirar
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());	
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
		if(puedeTransferir){
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible");
		}
		System.out.println(cuentaDeJimena.saldo);
		System.out.println(miCuenta.saldo);
		
	}
}
