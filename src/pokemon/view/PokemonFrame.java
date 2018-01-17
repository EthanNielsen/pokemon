package pokemon.view;

import javax.swing.JFrame;

import pokemon.controller.PokemonController;

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokedexPanel appPanel;
	
	
	public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		appPanel = new PokedexPanel(appController);
		
		setupFrame();
	}
	
	public PokemonController getBaseController()
	{
		return appController;
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Pokemon App");
		this.setResizable(false);
		this.setSize(600, 600);
		this.setVisible(true);
	}
	
}
