package main.java.strategies;

import java.util.List;

import main.java.princ.Choix;

public class Traitre implements Strategie {

	@Override
	public Choix joue() {
		return Choix.TRAHIR;
	}

	@Override
	public String getName() {
		return "traitre";
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
