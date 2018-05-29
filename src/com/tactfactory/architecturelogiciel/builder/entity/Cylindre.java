package com.tactfactory.architecturelogiciel.builder.entity;

public class Cylindre {
	private int puissance;
	private int volume;
	private double poids;
	
	public int getPuissance() {
		return puissance;
	}
	
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public double getPoids() {
		return poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	public Cylindre(int puissance, int volume, double poids) {
		super();
		this.puissance = puissance;
		this.volume = volume;
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Cylindre [puissance=" + puissance + ", volume=" + volume + ", poids=" + poids + "]";
	}
}
