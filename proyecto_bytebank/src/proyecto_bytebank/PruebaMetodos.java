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
		System.out.println(miCuenta.saldo);
		if (cuentaDeJimena.transferir(400, miCuenta)) {
			System.out.println("Transferencia exitosa");
		}
		
		
		Cuenta cuentaDeJimena = new Cuenta();
		//metodo transferir
		cuentaDeJimena.depositar(1000);
		cuentaDeJimena.transferir(400, miCuenta);
		
		System.out.println(cuentaDeJimena.saldo);
		System.out.println(miCuenta.saldo);
		
	}
}
