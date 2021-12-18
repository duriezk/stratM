package main.java.strategies;

import java.util.List;

import main.java.princ.Choix;

public class DonnantDonnantSoup extends DonnantDonnant {
	
	@SuppressWarnings("unused")
	private Choix coupAdversaire;
	
	public DonnantDonnantSoup(List<Choix> list) {
		super(list);
	}
	
	@Override
	public void setCoupAdverse(List<Choix> coups) {
		if (coups.isEmpty()) {
			this.coupAdversaire = Choix.TRAHIR;
		} else {
			this.coupAdversaire = coups.get(coups.size()-1);
		}
	}
	
	@Override
	public String getName() {
		return "Donnant Donnant soupconneux";
	}
	
	@Override
	public Choix joue() {
		return coupAdversaire;
	}
}

