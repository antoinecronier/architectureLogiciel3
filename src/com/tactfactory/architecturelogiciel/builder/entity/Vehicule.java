package com.tactfactory.architecturelogiciel.builder.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicule {
	private List<Roue> roues = new ArrayList<Roue>();
	private Carrosserie carrosserie;
	private Cylindre cylindre;
	private Reservoir reservoir;
	
	public List<Roue> getRoues() {
		return roues;
	}
	
	public void setRoues(List<Roue> roues) {
		this.roues = roues;
	}
	
	public Carrosserie getCarosserie() {
		return carrosserie;
	}
	
	public void setCarosserie(Carrosserie carosserie) {
		this.carrosserie = carosserie;
	}
	
	public Cylindre getCylindre() {
		return cylindre;
	}
	
	public void setCylindre(Cylindre cylindre) {
		this.cylindre = cylindre;
	}
	
	public Reservoir getReservoir() {
		return reservoir;
	}
	
	public void setReservoir(Reservoir reservoir) {
		this.reservoir = reservoir;
	}

	public Vehicule(List<Roue> roues, Carrosserie carosserie, Cylindre cylindre, Reservoir reservoir) {
		super();
		this.roues = roues;
		this.carrosserie = carosserie;
		this.cylindre = cylindre;
		this.reservoir = reservoir;
	}
	
	public Vehicule() {
	}

	@Override
	public String toString() {
		return "Vehicule [roues=" + roues + ", carrosserie=" + carrosserie + ", cylindre=" + cylindre + ", reservoir="
				+ reservoir + "]";
	}
}
