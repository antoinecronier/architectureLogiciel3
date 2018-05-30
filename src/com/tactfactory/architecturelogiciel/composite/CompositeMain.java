package com.tactfactory.architecturelogiciel.composite;

import com.tactfactory.architecturelogiciel.builder.VehiculeBuilder;

public class CompositeMain {
	public static void main(String[] args) {
		
		VehiculeBuilder builder = new VehiculeBuilder();
		
		Saison saison1 = new Saison();
		
		Course course1 = new Course();
		
		for (int i = 0; i < 10; i++) {
			course1.addVehicule(builder.configurationVoiture1().build());
		}
		
		saison1.addCourse(course1);
		
		
		Course course2 = new Course();
		
		saison1.addCourse(course2);
		
		saison1.addVehicule(course2, builder.configurationVoiture1().build());
		saison1.addVehicule(course2, builder.configurationVoiture1().build());
		saison1.addVehicule(course2, builder.configurationVoiture1().build());
		saison1.addVehicule(course2, builder.configurationVoiture1().build());
		
		saison1.run();
	}
}
