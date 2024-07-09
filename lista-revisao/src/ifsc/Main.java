package ifsc;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {

		Gato gato1 = new Gato();
		gato1.setNomeCientifico("Gatus Felinus");
		gato1.setApelido("neguinho");
		gato1.setClasse("felino");
		gato1.setPedigree("numsei");

		Gato gato2 = new Gato();
		gato2.setNomeCientifico("Gatus Felinas");
		gato2.setApelido("neguinha");
		gato2.setClasse("felino");
		gato2.setPedigree("numsei");

		Gato gato3 = new Gato();
		gato3.setNomeCientifico("Gatus Felinis");
		gato3.setApelido("cinzinha");
		gato3.setClasse("felino");
		gato3.setPedigree("numsei");

		Tutor tutor1 = new Tutor();
		tutor1.setNomeCompleto("joao");
         tutor1.setGato(gato1);
		Tutor tutor2 = new Tutor();
		tutor2.setNomeCompleto("pedro");
		tutor2.setGato(gato2);
		Tutor tutor3 = new Tutor();
		tutor3.setNomeCompleto("lucaas");
		tutor3.setGato(gato3);
		ArrayList<Tutor> tutor = new ArrayList<>();
		tutor.add(tutor1);
		tutor.add(tutor2);
		tutor.add(tutor3);
		
		for (Tutor tutores : tutor) {
			System.out.println(tutores.getNomeCompleto());
			System.out.println(tutores.getGato().getApelido());
			System.out.println(tutores.getGato().getNomeCientifico());
			System.out.println(tutores.getGato().getClasse());
			System.out.println(tutores.getGato().getPedigree());
			System.out.println("");
			
		}

	}
}
