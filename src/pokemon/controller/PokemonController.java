package pokemon.controller;


import java.util.ArrayList;
import java.util.List;

import pokemon.model.Giratina;
import pokemon.model.Mewtwo;
import pokemon.model.MrMime;
import pokemon.model.Palossand;
import pokemon.model.Pokemon;
import pokemon.model.Silvally;
import pokemon.model.Synthetic;
import pokemon.view.PokemonFrame;


public class PokemonController 
{	
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}	
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Giratina());
		pokedex.add(new Mewtwo());
		pokedex.add(new MrMime());
		pokedex.add(new Palossand());
		pokedex.add(new Silvally());
		pokedex.add(new Synthetic());
	}

	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	// This is a loop to go in and process everything in the list. Makes a String array as big as my list.
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}
	

	
	
}
