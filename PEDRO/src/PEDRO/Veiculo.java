package PEDRO;

public class Veiculo {
	
	
	private String Nome;
	private Integer ano;
	private Integer numeroRodas;
	private String fabricante;
	private String cor;
	
	public Integer getNumeroRodas() {
		return numeroRodas;
	}
	public void setNumeroRodas(Integer numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
}
