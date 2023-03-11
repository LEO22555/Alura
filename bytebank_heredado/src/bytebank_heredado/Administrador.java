package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticable {
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

}
