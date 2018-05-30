package com.tactfactory.architecturelogiciel.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tactfactory.architecturelogiciel.builder.entity.Vehicule;

public class Course extends Component {
	private List<Vehicule> classement = new ArrayList<Vehicule>();

	public List<Vehicule> getClassement() {
		return classement;
	}

	public void setClassement(List<Vehicule> classement) {
		this.classement = classement;
	}
	
	public void addVehicule(Vehicule vehicule) {
		this.getComposite().add(vehicule);
	}
	
	@Override
	public void run() {
		super.run();
		for (Component vehicule : this.getComposite()) {
			this.classement.add((Vehicule)vehicule);
		}
		Collections.sort(this.classement, new Comparator<Vehicule>() {

			@Override
			public int compare(Vehicule arg0, Vehicule arg1) {
				return arg0.getDateEnd().compareTo(arg1.getDateEnd());
			}
	    });
		
		System.out.println("Classement de la course :");
		for (Vehicule vehicule : classement) {
			System.out.println(vehicule);
		}
	}

	@Override
	public String toString() {
		return "Course [classement=" + classement + ", getComposite()=" + getComposite() + ", getMaxPlayer()="
				+ getMaxPlayer() + ", getDateStart()=" + getDateStart() + ", getDateEnd()=" + getDateEnd() + "]";
	}
}
