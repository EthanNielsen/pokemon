package pokemon.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import pokemon.controller.PokemonController;

public class PokedexPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
	public PokedexPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		healthLabel = new JLabel();
		attackLabel = new JLabel();
		nameLabel = new JLabel();
		numberLabel = new JLabel();
		evolvableLabel = new JLabel();
		modifierLabel = new JLabel();
		iconLabel = new JLabel();
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png")), JLabel.CENTER);
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField();
		numberField = new JTextField();
		attackField = new JTextField();
		healthField = new JTextField();
		modifierField = new JTextField();
		
		descriptionArea = new JTextArea();
		typeArea = new JTextArea();
		
		saveButton = new JButton();
		clearButton = new JButton();
		pokedexDropdown = new JComboBox();
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
		this.add(descriptionArea);
		this.add(typeArea);
		
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);	
	}
	
	private void setupPanel()
	{
		
	}
	
	private void updateImage()
	{
		
	}
	
	// This gets the types of the Pokemon and sets the background color to corispond with the their type.
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Ghost"))
		{
			firstType.setBackground(Color.BLACK);
		}
		else if (types[0].equals("Null"))
		{
			firstType.setBackground(Color.GRAY);
		}
		else if (types[0].equals("Psychic"))
		{
			firstType.setBackground(Color.CYAN);
		}
		else
		{
			firstType.setBackground(Color.RED);
		}
		
		if (types.length > 1)
		{
			if (types[1].equals("Ghost"))
			{
				secondType.setBackground(Color.GRAY);
			}
			else if (types[1].equals("Null"))
			{
				secondType.setBackground(Color.LIGHT_GRAY);
			}
			else if (types[1].equals("Psychic"))
			{
				secondType.setBackground(Color.BLACK);
			}
			else
			{
				secondType.setBackground(Color.RED);
			}
		}
		
		if (types.length == 3)
		{
			if (types[2].equals("Ghost"))
			{
				thirdType.setBackground(Color.GREEN);
			}
			else if (types[2].equals("Null"))
			{
				thirdType.setBackground(Color.BLUE);
			}
			else if (types[2].equals("Psychic"))
			{
				thirdType.setBackground(Color.RED);
			}
			else
			{
				thirdType.setBackground(Color.WHITE);
			}
		}
		
		if (types.length == 4)
		{
			if (types[3].equals("Ghost"))
			{
				fourthType.setBackground(Color.WHITE);
			}
			else if (types[3].equals("Null"))
			{
				fourthType.setBackground(Color.RED);
			}
			else if (types[3].equals("Psychic"))
			{
				fourthType.setBackground(Color.MAGENTA);
			}
			else
			{
				fourthType.setBackground(Color.YELLOW);
			}
		}
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
	
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}

}
