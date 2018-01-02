package pokemon.model;

public class Palossand extends Pokemon implements Ghost
{

	public Palossand()
	{
		super(770, "Palossand");
		setup();
	}
	
	public Palossand(String name)
	{
		super(770, name);
		setup();
	}
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
		System.out.print("Astonishing!");
	}
	
	protected void setup()
	{
		this.setAttackPoints(75);
		this.setCanEvolve(false);
		this.setEnhancementModifier(0.1);
		this.setHealthPoints(85);
	}
}
