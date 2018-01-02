package pokemon.model;

public class Silvally extends Pokemon implements Null
{

	public Silvally()
	{
		super(773, "Silvally");
		setup();
	}
	
	public Silvally(String name)
	{
		super(773, name);
		setup();
	}
	
	public Silvally(int number, String name)
	{
		super(number, name);
	}
	
	public void crushClaw()
	{
		System.out.print("Crumble");
	}
	
	public boolean punishmentCode(int amount)
	{
		return false;
	}
	
	public String takeDown()
	{
		return "I'll take down your code with me....";
	}
	
	protected void setup()
	{
		this.setAttackPoints(95);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.95);
		this.setHealthPoints(95);
	}
}
