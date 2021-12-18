package main.java.strategies;

import java.util.ArrayList;
import java.util.List;

import main.java.princ.Choix;

public class Rancunier implements Strategie {
	private Choix coupAdversaire;
	private ArrayList<Choix> liste = new ArrayList<>();
	
	public Rancunier(List<Choix> list) {
		this.liste = (ArrayList<Choix>) list;
		setCoupAdverse(list);
	}

	@Override
	public Choix joue() {
		if (liste.contains(Choix.TRAHIR)) {
			return Choix.TRAHIR;
		} else {
			return Choix.COOPERER;
		}
	}

	@Override
	public String getName() {
		return "Rancunier";
	}

	@Override
	public Strategie reinit() {
		return null;
	}

	@Override
	public void setCoupAdverse(List<Choix> coups) {
		if (coups.isEmpty()) {
			coupAdversaire = Choix.COOPERER;
		} else {
			this.coupAdversaire = coups.get(coups.size()-1);
		}
	}

}
