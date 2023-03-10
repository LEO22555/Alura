package bytebank_heredado;

public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.equals(admin);
	}

}
