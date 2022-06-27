
public abstract class Funcionario {
	private String enderecoFun;
	private String emailFun;
	private int cpfFun;
	private int telefoneFun;
	
	
	public String getEnderecoFun() {
		return enderecoFun;
	}
	public void setEnderecoFun(String enderecoFun) {
		this.enderecoFun = enderecoFun;
	}
	public String getEmailFun() {
		return emailFun;
	}
	public void setEmailFun(String emailFun) {
		this.emailFun = emailFun;
	}
	public int getCpfFun() {
		return cpfFun;
	}
	public void setCpfFun(int cpfFun) {
		this.cpfFun = cpfFun;
	}
	public int getTelefoneFun() {
		return telefoneFun;
	}
	public void setTelefoneFun(int telefoneFun) {
		this.telefoneFun = telefoneFun;
	}
}
