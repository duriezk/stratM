package main.java.strategies;

import java.util.List;

import main.java.princ.Choix;

public interface Strategie {
	
	public Choix joue() ;
	public String getName();
	public Strategie reinit();
	public void setCoupAdverse(List<Choix> choix);
	
}
