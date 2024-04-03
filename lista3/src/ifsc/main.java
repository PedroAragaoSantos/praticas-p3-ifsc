package ifsc;

public class main {
	public static void main(String[] args) {

		//instanciar a classe
		Pessoa pedro = new Pessoa();

		pedro.cpf = "123456";
		pedro.primeironome = "Pedro";
		pedro.sobrenome = "Henrique";

		System.out.println(pedro.cpf);
		System.out.println(pedro.primeironome);
		System.out.println(pedro.sobrenome);


		Pessoa juca = new Pessoa();
		juca.cpf = "789456";
		juca.primeironome = "Juca";
		juca.sobrenome = "Nalha";

		System.out.println(juca.cpf);
		System.out.println(juca.primeironome);
		System.out.println(juca.sobrenome);

		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0] = pedro;
		pessoas[1] = juca;  
}
}
