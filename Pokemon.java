package com.james.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int totalPokemon;
	
//	Create a Pokemon;
	public Pokemon() {	
		setTotalPokemon(getTotalPokemon() + 1);
	}
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.setType(type);
		setTotalPokemon(getTotalPokemon() + 1);
	}
	
	//Getters and setters
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public static int getTotalPokemon() {
		return totalPokemon;
	}
	public static void setTotalPokemon(int totalPokemon) {
		Pokemon.totalPokemon = totalPokemon;
	}
	
	//Things pokemon can do
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		System.out.println(pokemon.name + " health: " + pokemon.health);
	}
	

}
