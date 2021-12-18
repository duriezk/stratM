package main.java.strategies;

import java.util.List;

import main.java.princ.Choix;

public class DonnantDonnant implements Strategie {
	
	private Choix coupAdversaire;
	
	public DonnantDonnant(List<Choix> list) {
		setCoupAdverse(list);
	}
	
	@Override
	public void setCoupAdverse(List<Choix> coups) {
		if (coups.isEmpty()) {
			this.coupAdversaire = Choix.COOPERER;
		} else {
			this.coupAdversaire = coups.get(coups.size()-1);
		}
	}
	
	@Override
	public String getName() {
		return "Donnant_Donnant";
	}

	@Override
	public Choix joue() {
		return coupAdversaire;
	}

	@Override
	public Strategie reinit() {
		return null;
	}
}
