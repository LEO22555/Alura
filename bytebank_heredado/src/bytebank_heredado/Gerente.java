package bytebank_heredado;

public class Gerente extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";	
	}
	
	public double getBonificacion() {
		System.out.println("EJECUTANDO TEST DE GERENTE");
		return super.getSalario() + this.getSalario()*0.05;
	}
}