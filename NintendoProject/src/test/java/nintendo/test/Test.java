package nintendo.test;

import java.util.ArrayList;
import java.util.List;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) 
	{
		Adresse adresse = new Adresse("270","rue hyrule","Toulouse");
		Boutique boutique = new Boutique("Nintendo Store Shop", adresse);
		Console Switch = new Console("Switch",null,null);
		List<Jeu> listeAchats = new ArrayList<>();
		
		Jeu Jeu1 = new Jeu("Super Smash Bros", Switch, boutique);
		Jeu Jeu2 = new Jeu("Super Mario 64 Redux", Switch, boutique);
		Jeu Jeu3 = new Jeu("Mario Kart 10", Switch, boutique);
		Jeu Jeu4 = new Jeu("Super Mario Bros Return", Switch, boutique);
		Jeu Jeu5 = new Jeu("Mario clash Luigi", Switch, boutique);
		
		Client client1 = new Client("Bowser","John");
		Client client2 = new Client("MiniBowser","Junior");
		
		listeAchats.add(Jeu1);
        listeAchats.add(Jeu2);
        
       System.out.println("Ceci est le client 2 : " + client2.getPrenom() + " " + client2.getNom());
       System.out.println("Ceci est le jeu 2 : " + Jeu2.getTitre());
       System.out.println("Ceci est la boutique : " + boutique.getNom() + " à l'adresse suivante : " + adresse.getNumero() + " " + adresse.getRue() + " " + adresse.getVille());
       System.out.println(listeAchats.toString());		

	}

}
