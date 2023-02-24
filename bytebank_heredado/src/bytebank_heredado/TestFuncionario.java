package bytebank_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario leo = new Contador();
		leo.setDocumento("5555");
		leo.setNombre("Leonardo");
		leo.setSalario(2000);
		leo.setTipo(0);
		
		System.out.println(leo.getBonificacion());
		System.out.println(leo.getSalario());
	}
}
