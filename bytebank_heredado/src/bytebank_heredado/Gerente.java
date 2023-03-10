package bytebank_heredado;

public class Gerente extends FuncionarioAutenticable {
	
	
	public double getBonificacion() {
		System.out.println("EJECUTANDO TEST DE GERENTE");
		return 2000;
	}
}