package first_step;

public class EjemploScope {

	    public static void main(String[] args) {

	        boolean fuePromovido = true;

	        if (fuePromovido) {
	            double salario = 4200.0;
	        } else {
	            double salario = 3800.0;
	        }

	        System.out.println(salario);
	    }
	}