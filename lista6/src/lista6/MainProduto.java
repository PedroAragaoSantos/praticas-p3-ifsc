package lista6;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Desktop> desktops = new ArrayList<>();
		Desktop p1 = new Desktop();
		p1.setFabricante("Lenovo");
		p1.setCodBarras(81739273947l);
		p1.setGamer(true);
		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("mouse");
		pecas.add("monitor");
		pecas.add("microfone");
		pecas.add("Jogo de Panelas Solar em Aço Inox com Fundo Triplo e Tampas de Inox 6 Peças Tramontina");

		p1.setPecas(pecas);
		desktops.add(p1);

		Desktop p2 = new Desktop();
		p2.setFabricante("Sansumg");
		p2.setCodBarras(826385637495l);
		p2.setGamer(false);
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("mouse");
		pecas2.add("mousepad");
		pecas2.add("VOLKSWAGEN GOLF 20-TSI-GTI-16V-TURBO-GASOLINA-4P-AUTOMATICO");
		p2.setPecas(pecas);
		desktops.add(p2);

		Desktop p3 = new Desktop();
		p3.setFabricante("Lg");
		p3.setCodBarras(826385637495l);
		p3.setGamer(false);
		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("mouse");
		pecas3.add("mousepad");
		pecas3.add("Panela Polishop Sauté Grand Vermelha 24cm");
		p3.setPecas(pecas);
		desktops.add(p3);

		ArrayList<Smartphone> smartphones = new ArrayList<>();
		Smartphone s1 = new Smartphone();
		s1.setCor("Azul");
		s1.setCodBarras(826385637495l);
		s1.setFabricante("Apple");
		s1.setDimensoesTela("1720x1268");
		smartphones.add(s1);
		Smartphone s2 = new Smartphone();
		s2.setCor("Azul");
		s2.setCodBarras(829046937203l);
		s2.setFabricante("Xiaomi");
		s2.setDimensoesTela("1320x768");
		smartphones.add(s2);
		Smartphone s3 = new Smartphone();
		s3.setCor("Azul");
		s3.setCodBarras(192736495739l);
		s3.setFabricante("Samsung");
		s3.setDimensoesTela("1280x720");
		smartphones.add(s3);
		
		for (Desktop desktop : desktops) {
			System.out.println(desktop.getFabricante());
			System.out.println(desktop.getCodBarras());
			System.out.println(desktop.isGamer());
			System.out.println(desktop.getPecas());
			
		}

		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone.getCor());
			System.out.println(smartphone.getCodBarras());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());

		}
		
		

	}
}
