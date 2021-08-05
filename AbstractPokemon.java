package com.james.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon poke = new Pokemon(name, health, type);
		return poke;
	}

	
	public String pokemonInfo(Pokemon pokemon) {
		int info = pokemon.getHealth();
		String infoName = pokemon.getName();
		String infoType = pokemon.getType();
		return infoName + infoType + info;
	}


}
