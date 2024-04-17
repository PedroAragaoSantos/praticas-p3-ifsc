package lista6;

public class Smartphone extends Produto {
	private String dimensoesTela;
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDimensoesTela() {
		return dimensoesTela;
	}

	public void setDimensoesTela(String dimensoesTela) {
		this.dimensoesTela = dimensoesTela;
	}
}
