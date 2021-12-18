package main.java.strategies;

import java.util.List;

import main.java.princ.Choix;

public class Gentil implements Strategie {

	@Override
	public Choix joue() {
		return Choix.COOPERER;
	}

	@Override
	public String getName() {
		return "gentil";
	}

	@Override
	public Strategie reinit() {
		return null;
	}

	@Override
	public void setCoupAdverse(List<Choix> choix) {
		throw new UnsupportedOperationException();
	}

}
