package com.tactfactory.architecturelogiciel.composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tactfactory.architecturelogiciel.builder.entity.Vehicule;

public abstract class Component {
	private List<Component> composite = new ArrayList<Component>();
	private int maxPlayer;
	private Date dateStart;
	private Date dateEnd;
	
	public List<Component> getComposite() {
		return composite;
	}

	public void setComposite(List<Component> composite) {
		this.composite = composite;
	}

	public int getMaxPlayer() {
		return maxPlayer;
	}
	
	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}
	
	public Date getDateStart() {
		return dateStart;
	}
	
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	
	public Date getDateEnd() {
		return dateEnd;
	}
	
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Component(int maxPlayer, Date dateStart, Date dateEnd) {
		super();
		this.maxPlayer = maxPlayer;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
	
	public Component() {
		
	}
	
	public void addVehicule(Course course, Vehicule vehicule) {
		if (this.composite.contains(course)) {
			Component composite = this.composite.get(this.composite.indexOf(course));
			((Course)composite).addVehicule(vehicule);
		}else {
			course.getComposite().add(vehicule);
			this.composite.add(course);
		}
	}
	
	public void addCourse(Course course) {
		this.composite.add(course);
	}
	
	public void removeCourse(Course course) {
		if (this.composite.contains(course)) {
			this.composite.remove(course);
		}
	}
	
	public void removeVehicule(Vehicule vehicule) {
		if (this.composite.contains(vehicule)) {
			this.composite.remove(vehicule);
		}
	}
	
	public void removeAllVehicule(Vehicule vehicule) {
		for (Component component : composite) {
			component.removeVehicule(vehicule);
		}
	}
	
	public void Remove(Component component) {
		if (this.composite.contains(component)) {
			this.composite.remove(component);
		}
	}
	
	public void run() {
		if (composite.size() > 0) {
			for (Component component : composite) {
				component.run();
			}
			System.out.println(this);
		}
	}
}
