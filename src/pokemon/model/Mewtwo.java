package pokemon.model;

public class Mewtwo extends Pokemon implements Psychic
{
	
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
}
