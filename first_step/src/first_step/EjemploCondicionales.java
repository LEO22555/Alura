package first_step;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Hola Leo");
		int edad = 30;
		int cantidad = 1;
		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}else {
			if (cantidad>=2) {
				System.out.println("No tienes la edad pero esta permitido su entrada");
			}else {
				System.out.println("No puedes entrar");
			}	
		}
	}
}
