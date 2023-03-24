package java_pila_ejecucion;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		} catch (Exception me) {
			me.printStackTrace();
		}
		System.out.println("Fin metodo 1");
	}
	
	private static void metodo2() throws MiException {
		System.out.println("Inicio metodo2");
		int a = 50/0; //Arithmetic Exception
		Cuenta c = null; //NullPointerException
		c.deposita();
		throw new MiException("Mi excepcion fue lanzada");
	}
	{

		
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
			
			try {
				if (i==3) {
				int num = 0;
				int resultado = i/num;
				System.out.println(resultado);
				}
				
				String test = null;
				System.out.println(test.toString());
				
			} catch(ArithmeticException exception) { //Atrapa el error
				System.out.println("Atrapo Arithmetic");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
				} catch(NullPointerException exception) { //Atrapa el error
				System.out.println("Atrapo NullPointer");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
				}
		}
		System.out.println("Fin metodo 2");
	}

}
