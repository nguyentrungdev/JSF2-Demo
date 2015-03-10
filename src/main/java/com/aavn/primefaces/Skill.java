package com.aavn.primefaces;

import java.util.ArrayList;
import java.util.List;

public class Skill {
	private int id;
	private String label;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	public Skill() {}
	
	public Skill(int id, String label) {
		this.id = id;
		this.label = label;
	}
	
	public static List<Skill> getSkills() {
		List<Skill> skills = new ArrayList<Skill>();
		skills.add(new Skill(1, "Java"));
		skills.add(new Skill(2, ".Net"));
		skills.add(new Skill(3, ".PHP"));
		skills.add(new Skill(4, "iOS"));
		skills.add(new Skill(5, "Android"));
		skills.add(new Skill(6, "Testing"));
		//skills.add(new Skill(-1, "Other"));
		return skills;
	}
}

