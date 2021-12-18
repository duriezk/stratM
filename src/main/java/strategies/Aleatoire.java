package main.java.strategies;

import java.util.List;

import main.java.princ.Choix;

public class Aleatoire implements Strategie {
	int nbTour = 0;

	public Aleatoire(List<Choix> list) {
		if (list.size()%2 == 0) {
			setNbTour(0);
		} else {
			setNbTour(1);
		}
	}
	
	@Override
	public Choix joue() {
		if (nbTour%2 == 0) {
			setNbTour(nbTour+1);
			return Choix.COOPERER;
		} else {
			setNbTour(nbTour+1);
			return Choix.TRAHIR;
		}
	}

	@Override
	public String getName() {
		return "Aléatoire";
	}

	@Override
	public Strategie reinit() {
		return null;
	}
	
	public int getNbTour() {
		return nbTour;
	}

	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
	}

	@Override
	public void setCoupAdverse(List<Choix> choix) {		
		throw new UnsupportedOperationException();
	}

}
