package pokemon.model;

public class Synthetic extends Silvally implements Null
{
	
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
	
}
