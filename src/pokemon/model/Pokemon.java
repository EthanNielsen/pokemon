package pokemon.model;

public abstract class Pokemon 
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;

	public Pokemon (int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	// Returns all the types like poison, fighting, etc... based on the Pokemon chosen.
	public final String[] getPokemonTyples()
	{
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		for(int index = 0; index < types.length; index++)
		{
			String currentInterface = types[index].getCanonicalName(); // The full path name is getCanonicalName
			currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ",", "");
			pokeTypes[index] = currentInterface;
		}
		
		return pokeTypes;
	}
	
	// Is what the Pokemon will say to the user, it will state its health.
	public String toString()
	{
		String description = "I am a " + name + ", and my HP is " + healthPoints;
		
		return description;
	}
	
	// Tells us inside the call what we are dealing with.
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
}
