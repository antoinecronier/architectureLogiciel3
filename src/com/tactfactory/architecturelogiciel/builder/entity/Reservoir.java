package com.tactfactory.architecturelogiciel.builder.entity;

public class Reservoir {
	private double contenance;
	private int volume;
	private double poids;
	
	public double getContenance() {
		return contenance;
	}
	
	public void setContenance(double contenance) {
		this.contenance = contenance;
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

	public Reservoir(double contenance, int volume, double poids) {
		super();
		this.contenance = contenance;
		this.volume = volume;
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Reservoir [contenance=" + contenance + ", volume=" + volume + ", poids=" + poids + "]";
	}
}
