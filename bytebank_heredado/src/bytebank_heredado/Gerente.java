package bytebank_heredado;

public class Gerente extends Funcionario implements Autenticable {
	
	
	public double getBonificacion() {
		System.out.println("EJECUTANDO TEST DE GERENTE");
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}