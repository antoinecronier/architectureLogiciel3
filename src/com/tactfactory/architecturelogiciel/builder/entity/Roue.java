package com.tactfactory.architecturelogiciel.builder.entity;

public class Roue {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Roue(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Roue [type=" + type + "]";
	}
}
