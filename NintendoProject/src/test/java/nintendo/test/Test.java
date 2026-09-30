package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) 
	{
		Adresse adresse = new Adresse("rue hyrule","31000","Toulouse");
		Boutique boutique = new Boutique("Nintendo Store Shop", adresse);
		Console Switch = new Console("Switch");
		Jeu Jeu1 = new Jeu("Super Smash Bros", Switch, boutique);
		Jeu Jeu2 = new Jeu("Super Mario 64 Redux", Switch, boutique);
		Jeu Jeu3 = new Jeu("Mario Kart 10", Switch, boutique);
		Jeu Jeu4 = new Jeu("Super Mario Bros Return", Switch, boutique);
		Jeu Jeu5 = new Jeu("Mario clash Luigi", Switch, boutique);
		

	}

}
