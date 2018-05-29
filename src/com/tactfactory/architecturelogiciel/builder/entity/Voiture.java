package com.tactfactory.architecturelogiciel.builder.entity;

import java.util.List;

public class Voiture extends Vehicule {

	public Voiture(List<Roue> roues, Carrosserie carosserie, Cylindre cylindre, Reservoir reservoir) {
		super(roues, carosserie, cylindre, reservoir);
	}
	
	public Voiture() {
		
	}

	@Override
	public String toString() {
		return "Voiture [getRoues()=" + getRoues() + ", getCarosserie()=" + getCarosserie() + ", getCylindre()="
				+ getCylindre() + ", getReservoir()=" + getReservoir() + "]";
	}
}
