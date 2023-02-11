package first_step;

public class EjercicioTablaMultiplicacion {

	public static void main(String[] args) {
		for(int contador = 1; contador <= 10; contador++) {
			for(int multiplicacion = 1; multiplicacion <= 10; multiplicacion++) {
				System.out.print(contador*multiplicacion);
				System.out.println(" ");				
			}
			System.out.println();
		}

	}

}
