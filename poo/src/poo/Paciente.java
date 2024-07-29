package poo;

public class Paciente extends Pessoa {
	String codigo;
    String nome;

	public Paciente(String nome, String cpf, String codigo) {
		super(nome, cpf);
		super.setNome(nome);
		this.nome = nome + "#";
		this.codigo = codigo;
		System.out.println("criando paciente: " + nome);
	}

	public Paciente(String nome, String cpf) {
		this(nome, cpf, "1");
	}

	@Override
	public void print() {
		super.print();
		System.out.println("======");
		System.out.println("Codigo: " + codigo);
		System.out.println("======");
	}

	@Override
	public String toString() {
		String res = "Nome: " + super.getNome();
		res += "\n";
		res += "Cpf: " + cpf;
		res += "\n";
		res += "Codigo: " + codigo;
		return res;
	}
}
