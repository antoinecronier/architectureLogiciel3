package com.tactfactory.architecturelogiciel.builder.entity;

import java.util.List;

public class Moto extends Vehicule {

	public Moto(List<Roue> roues, Carrosserie carosserie, Cylindre cylindre, Reservoir reservoir) {
		super(roues, carosserie, cylindre, reservoir);
	}
	
	public Moto() {
		
	}

	@Override
	public String toString() {
		return "Moto [getRoues()=" + getRoues() + ", getCarosserie()=" + getCarosserie() + ", getCylindre()="
				+ getCylindre() + ", getReservoir()=" + getReservoir() + "]";
	}
}
