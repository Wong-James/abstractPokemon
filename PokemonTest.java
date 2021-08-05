package com.james.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon first = new Pokemon("Pikachu", 90, "Electric");
		Pokemon second = new Pokemon("Bulbasaur", 95, "Grass");
		first.getName();
		first.attackPokemon(second);
		second.attackPokemon(first);
	}

}
