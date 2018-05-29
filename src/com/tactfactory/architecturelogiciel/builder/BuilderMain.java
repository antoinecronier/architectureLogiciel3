package com.tactfactory.architecturelogiciel.builder;

import com.tactfactory.architecturelogiciel.builder.entity.Vehicule;

public class BuilderMain {

	public static void main(String[] args) {
		VehiculeBuilder builder = new VehiculeBuilder();
		Vehicule voiture1 = builder.configurationVoiture1().build();
		System.out.println(voiture1);
		
		Vehicule moto1 = builder
			.setBaseType(1)
			.addRoues()
			.addCarrosserie()
			.build();
		
		System.out.println(moto1);
	}
}
