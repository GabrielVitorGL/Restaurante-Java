
public class Pedido {
	private String dtPed;
	private String horarioPed;
	private double valorPed;
	private int numPed;
	
	Cozinheiro cozinheiro = new Cozinheiro();
	NotaFiscal notaFiscal = new NotaFiscal();
	Cliente cliente = new Cliente();
	Bebida bebida = new Bebida();
	Prato prato = new Prato();
	
	public void obterValorPed() {
		valorPed = bebida.getValorBebida() + prato.getValorPrato();
		notaFiscal.setValorTotal(valorPed);
	}
	
	
	public String getDtPed() {
		return dtPed;
	}

	public void setDtPed(String dtPed) {
		this.dtPed = dtPed;
	}

	public String getHorarioPed() {
		return horarioPed;
	}

	public void setHorarioPed(String horarioPed) {
		this.horarioPed = horarioPed;
	}

	public double getValorPed() {
		return valorPed;
	}

	public void setValorPed(double valorPed) {
		this.valorPed = valorPed;
	}

	public int getNumPed() {
		return numPed;
	}

	public void setNumPed(int numPed) {
		this.numPed = numPed;
	}
}
