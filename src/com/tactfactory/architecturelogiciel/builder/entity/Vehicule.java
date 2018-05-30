package com.tactfactory.architecturelogiciel.builder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.tactfactory.architecturelogiciel.composite.Component;
import com.tactfactory.architecturelogiciel.composite.Course;

public abstract class Vehicule extends Component {
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
	public void addVehicule(Course course, Vehicule vehicule) {

	}

	@Override
	public void addCourse(Course course) {

	}

	@Override
	public void removeCourse(Course course) {

	}

	@Override
	public void removeVehicule(Vehicule vehicule) {

	}

	@Override
	public void removeAllVehicule(Vehicule vehicule) {

	}

	@Override
	public void Remove(Component component) {

	}

	@Override
	public void run() {
		Date date = new Date();
		Random rand = new Random();
		date.setMinutes(rand.nextInt(59));
		date.setSeconds(rand.nextInt(59));
		this.setDateEnd(date);
	}

	@Override
	public String toString() {
		return "Vehicule [roues=" + roues + ", carrosserie=" + carrosserie + ", cylindre=" + cylindre + ", reservoir="
				+ reservoir + "]";
	}
}
