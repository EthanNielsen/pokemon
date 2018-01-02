package pokemon.model;

public class Synthetic extends Silvally implements Null
{
	
	public Synthetic() // Constroctor
	{
		super(772, "Synthetic");
		setup();
	}
	
	public Synthetic(String name)
	{
		super(772, name);
		setup();
	}
	
	public Synthetic(int number, String name)
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
	
	protected void setup() // Methods
	{
		this.setAttackPoints(95);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.95);
		this.setHealthPoints(95);
	}
}
