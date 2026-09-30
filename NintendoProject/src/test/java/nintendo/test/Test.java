package nintendo.test;

import nintendo.model.Jeu;
import nintendo.model.Console;

public class Test {

	public static void main(String[] args) 
	{
		Console Switch = new Console("Switch");
		Jeu Jeu1 = new Jeu("Super Smash Bros", Switch);
		Jeu Jeu2 = new Jeu("Super Mario 64 Redux", Switch);
		Jeu Jeu3 = new Jeu("Mario Kart 10", Switch);
		Jeu Jeu4 = new Jeu("Super Mario Bros Return", Switch);
		Jeu Jeu5 = new Jeu("Mario clash Luigi", Switch);
		
	}

}
