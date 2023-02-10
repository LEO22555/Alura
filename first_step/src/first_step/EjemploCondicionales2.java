package first_step;

public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("Hola Leo");
		int edad = 30;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar= edad >= 18 && esPareja;
		System.out.println("El valor de la condición es: " + esPareja);
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}else {
			System.out.println("No puedes entrar");
			}	
		}
	}