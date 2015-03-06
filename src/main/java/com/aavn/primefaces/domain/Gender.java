package com.aavn.primefaces.domain;

public enum Gender {
	MALE((short)1, "Male"), FEMALE((short)0, "Female");
	private short id;
	private String label;

	private Gender(short id, String label) {
		this.id = id;
		this.label = label;
	}

	public short getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
	}
}
