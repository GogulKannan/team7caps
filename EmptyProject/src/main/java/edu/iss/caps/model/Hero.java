package edu.iss.caps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="heros")
public class Hero  {
	@Id
	private String name;
	private String description;
	private String play;
	//@OneToOne (mappedBy="Address")
	//private Address address;
	//@OneToMany
	//private ArrayList<Movies> moviesActed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlay() {
		return play;
	}
	public void setPlay(String play) {
		this.play = play;
	}
	@Override
	public String toString() {
		return "HeroDTO [description=" + description + ", name=" + name
				+ ", play=" + play + "]";
	}
	public Hero(String name, String description, String play) {
		super();
		this.name = name;
		this.description = description;
		this.play = play;
	}
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
