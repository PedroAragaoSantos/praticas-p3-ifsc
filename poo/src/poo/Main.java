package poo;

public class Main {
	public static void main(String args[]) {
		Pessoa p = new Paciente("Pedro", "122", "7");
		p.print();
		System.out.println(p);
		System.out.println(p.getNome());
		
		System.out.println(((Paciente)p).codigo);
		Paciente paciente = (Paciente) p;
        System.out.println(paciente.codigo);
		float i = 5 / 2f;
		System.out.println(i);
	}
}
