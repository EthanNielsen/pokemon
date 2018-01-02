package pokemon.model;

public class Giratina extends Pokemon implements Ghost
{

	public Giratina()
	{
		super(487, "Giratina")
		setup();
	}
	
	public Giratina(String name)
	{
		super(487, name);
		setup();
	}
	
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
	
	protected void setup()
	{
		this.setAttackPoints(100);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.79);
		this.setHealthPoints(150);
	}
}
