package bytebank_heredado;

public class Contador extends Funcionario {
	
	@Override
	public double getBonificacion() {
		System.out.println("EJECUTANDO TEST DE CONTADOR");
		return 200;
	}

}
