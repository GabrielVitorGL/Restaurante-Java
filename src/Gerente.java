
public class Gerente extends Funcionario {
	
	public String listarGerente() {

		return "Gerente: " + getEnderecoFun() + "\n" + getEmailFun() + "\n" + getCpfFun() + "\n" + getTelefoneFun();

	}
}
