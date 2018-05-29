package com.tactfactory.architecturelogiciel.builder;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.architecturelogiciel.builder.entity.Carrosserie;
import com.tactfactory.architecturelogiciel.builder.entity.Cylindre;
import com.tactfactory.architecturelogiciel.builder.entity.Moto;
import com.tactfactory.architecturelogiciel.builder.entity.Reservoir;
import com.tactfactory.architecturelogiciel.builder.entity.Roue;
import com.tactfactory.architecturelogiciel.builder.entity.Vehicule;
import com.tactfactory.architecturelogiciel.builder.entity.Voiture;

public class VehiculeBuilder {
	private Vehicule vehicule;
	private List<Roue> roues = new ArrayList<Roue>();
	private Carrosserie carrosserie;
	private Cylindre cylindre;
	private Reservoir reservoir;
	
	public VehiculeBuilder setBaseType(int type) {
		switch (type) {
		case 1:
			vehicule = new Moto();
			break;
		case 2:
			vehicule = new Voiture();
			break;
		default:
			vehicule = new Voiture();
			break;
		}
		
		roues = new ArrayList<Roue>();
		carrosserie = null;
		cylindre = null;
		reservoir = null;
		
		return this;
	}
	
	public VehiculeBuilder addRoues(List<Roue> roues) {
		this.roues.addAll(roues);
		return this;
	}
	
	public VehiculeBuilder addRoues() {
		List<Roue> roues = new ArrayList<Roue>();
		
		if (vehicule instanceof Voiture) {
			for (int i = 0; i < 4; i++) {
				roues.add(new Roue("roue voiture"));
			}
		}else {
			for (int i = 0; i < 2; i++) {
				roues.add(new Roue("roue moto"));
			}
		}
		
		this.roues.addAll(roues);
		
		return this;
	}
	
	public VehiculeBuilder addCarrosserie(Carrosserie carrosserie) {
		this.carrosserie = carrosserie;
		return this;
	}
	
	public VehiculeBuilder addCarrosserie() {
		Carrosserie carrosserie;
		
		if (vehicule instanceof Voiture) {
			carrosserie = Carrosserie.TYPE_1;
		}else {
			carrosserie = Carrosserie.TYPE_2;
		}
		this.carrosserie = carrosserie;
		return this;
	}
	
	public VehiculeBuilder addCylindre(Cylindre cylindre) {
		this.cylindre = cylindre;
		return this;
	}
	
	public VehiculeBuilder addCylindre() {
		Cylindre cylindre;
		if (vehicule instanceof Voiture) {
			cylindre = new Cylindre(100, 30, 200);
		}else {
			cylindre = new Cylindre(80, 15, 120);
		}
		this.cylindre = cylindre;
		return this;
	}
	
	public VehiculeBuilder addReservoir(Reservoir reservoir) {
		this.reservoir = reservoir;
		return this;
	}
	
	public VehiculeBuilder addReservoir() {
		Reservoir reservoir;
		if (vehicule instanceof Voiture) {
			reservoir = new Reservoir(50, 40, 60);
		}else {
			reservoir = new Reservoir(30, 20, 20);
		}
		this.reservoir = reservoir;
		return this;
	}
	
	public VehiculeBuilder configurationVoiture1() {
		this.vehicule = new Voiture();
		this.carrosserie = Carrosserie.TYPE_1;
		this.cylindre = new Cylindre(100, 30, 200);
		this.reservoir = new Reservoir(50, 40, 60);
		for (int i = 0; i < 4; i++) {
			this.roues.add(new Roue("roue voiture"));
		}
		return this;
	}
	
	public Vehicule build() {
		Vehicule vehicule = this.vehicule;
		vehicule.setCarosserie(this.carrosserie);
		vehicule.setCylindre(this.cylindre);
		vehicule.setReservoir(this.reservoir);
		vehicule.setRoues(this.roues);
		return vehicule;
	}
}
