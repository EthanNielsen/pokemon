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


public class PokemonController 
{	
	public void start()
	{
		
	}
	
	private List<Pokemon> pokedex;
	
	public List<Pokemon> getPokedex()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
	// Below this is doing the same as buildPokedex but instead its turning the pokemon into variables. buildPokedex adds the pokemon to the list.
//		Giratina myGira = new Giratina();
//		Mewtwo myMew = new Mewtwo();
//		MrMime myMime = new MrMime();
//		Palossand mySand = new Palossand();
//		Silvally mySilv = new Silvally();
//		Synthetic mySynth = new Synthetic();
//		
		return getPokedex();
//		appFrame = new PokemonFrame(this);
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
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValiduble(String input)
	{
		return false;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
	}
	
	
	
}
