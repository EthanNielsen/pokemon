package pokemon.model;

public class Palossand extends Pokemon implements Ghost
{

	public Palossand(int number, String name)
	{
		super(number, name);
	}
	
	public int actionHex()
	{
		return 0;
	}
	
	public boolean actionCurse(int amount)
	{
		return true;
	}
	
	public void actionAstonish()
	{
		
	}
}
