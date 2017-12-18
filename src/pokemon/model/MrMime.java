package pokemon.model;

public class MrMime extends Pokemon implements Psychic
{

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
		return "Mr. Mime!";
	}
}
