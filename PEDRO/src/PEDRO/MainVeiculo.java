package PEDRO;

import java.util.ArrayList;

public class MainVeiculo {
public static void main(String[] args) {
	
	Veiculo civic = new Veiculo();
	
     civic.setNome("Honda Civic");
     civic.setNumeroRodas(4);
     civic.setFabricante("Honda");
     civic.setCor("pretao maloka");
     civic.setAno(2008);
     
     Veiculo palio = new Veiculo();
 	
     palio.setNome("Fiat Palio");
     palio.setNumeroRodas(4);
     palio.setFabricante("Fiat");
     palio.setCor("pretao maloka");
     palio.setAno(2010);
     
     Veiculo XRE = new Veiculo();
 	
     XRE.setNome("Honda XRE");
     XRE.setNumeroRodas(2);
     XRE.setFabricante("Honda");
     XRE.setCor("vermelho maloka");
     XRE.setAno(2019);
     
    ArrayList<Veiculo> veiculos = new ArrayList<>();
    veiculos.add(XRE);
    veiculos.add(civic);
    veiculos.add(palio);
    
    for (Veiculo veiculo : veiculos) {
		System.out.println(veiculo.getNome());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getFabricante());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getNumeroRodas());
	}
     
     
}
}
