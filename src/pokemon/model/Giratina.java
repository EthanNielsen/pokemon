package pokemon.model;

public class Giratina extends Pokemon implements Ghost
{

	public Giratina(int number, String name)
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
		System.out.print("Astonishing!");
	}
	
}
