package pokemon.model;

public class Beheeyem extends Pokemon implements Psychic
{

	public Beheeyem(int number, String name)
	{
		super(number, name);
	}
	
	public boolean actionConfusion()
	{
		return true;
	}

	public void actionGravity()
	{
		
	}
	
	public String actionKinesis(int ammount)
	{
		return "I'll take your cows ";
	}
}
