package bytebank_heredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario leonardo = new Funcionario ();
		leonardo.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificacion controlBonificacion =
				new ControlBonificacion();
		
		controlBonificacion.registrarSalario(leonardo);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
	}
}
