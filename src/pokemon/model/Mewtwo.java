package pokemon.model;

public class Mewtwo extends Pokemon implements Psychic
{
	
	public Mewtwo()
	{
		super(150, "Mewtwo");
		setup();
	}
	
	public Mewtwo(String name)
	{
		super(150, name);
		setup();
	}
	
	public Mewtwo(int number, String name)
	{
		super(number, name);
	}
	
	public boolean actionConfusion()
	{
		return true;
	}

	public void actionGravity()
	{
		System.out.print("Blaaaa");
	}
	
	public String actionKinesis(int ammount)
	{
		return "I'm in your head ;o ";
	}
	
	protected void setup()
	{
		this.setAttackPoints(110);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1.56);
		this.setHealthPoints(106);
	}
}
