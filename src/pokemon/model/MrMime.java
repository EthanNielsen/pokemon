package pokemon.model;

public class MrMime extends Pokemon implements Psychic
{

	public MrMime()
	{
		super(122, "MrMime");
		setup();
	}
	
	public MrMime(String name)
	{
		super(122, name);
		setup();
	}
	
	public MrMime(int number, String name)
	{
		super(number, name);
	}
	
	public boolean actionConfusion()
	{
		return true;
	}

	public void actionGravity()
	{
		System.out.print("Ogon po gotovnosti!");
	}
	
	public String actionKinesis(int ammount)
	{
		return "MrMime!";
	}
	
	protected void setup()
	{
		this.setAttackPoints(45);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.01);
		this.setHealthPoints(40);
	}
	
}
