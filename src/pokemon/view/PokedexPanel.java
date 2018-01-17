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
	private JLabel iconLabel_1;
	
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
		numberField = new JTextField();
		attackField = new JTextField();
		healthField = new JTextField();
		modifierField = new JTextField();
		
		descriptionArea = new JTextArea(5, 10);
		typeArea = new JTextArea(4, 15);
		
		saveButton = new JButton();
		clearButton = new JButton();
		
		pokedexDropdown = new JComboBox();
	
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupPanel();
		setupComboBox();
		setupTypePanels();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
			
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
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
		
		evolvableBox = new JCheckBox();
		
		this.add(evolvableBox);
		nameField = new JTextField();
		this.add(nameField);
		
		iconLabel_1 = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png")), JLabel.CENTER);

		iconLabel_1.setBackground(Color.CYAN);
		this.add(iconLabel_1);
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
	
	// This gets the types of the Pokemon and sets the background color to correspond with the their type.
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
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -172, SpringLayout.EAST, this);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 6, SpringLayout.EAST, saveButton);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 404, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -18, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -18, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 105, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 404, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -18, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 6, SpringLayout.SOUTH, healthField);
		
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -60, SpringLayout.WEST, attackField);
		
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 6, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 404, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, numberField);
		
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 18, SpringLayout.SOUTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 0, SpringLayout.WEST, descriptionArea);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, 0, SpringLayout.EAST, numberField);
		
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 5, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 5, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, saveButton);
		
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 196, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, -48, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstType, -400, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 0, SpringLayout.NORTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 6, SpringLayout.EAST, firstType);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, -48, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -354, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 6, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, -48, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, thirdType, -308, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.EAST, fourthType, -262, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, fourthType, 0, SpringLayout.NORTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 6, SpringLayout.EAST, thirdType);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, -48, SpringLayout.SOUTH, this);
		
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -51, SpringLayout.WEST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 74, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, numberField);
		
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 1, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 6, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 404, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -18, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 19, SpringLayout.EAST, iconLabel_1);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 29, SpringLayout.EAST, iconLabel_1);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel_1, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel_1, -260, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, thirdType, 6, SpringLayout.SOUTH, iconLabel_1);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel_1, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel_1, -6, SpringLayout.NORTH, firstType);
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
		
		// This code 
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText()) && appController.isValidDouble(modifierField.getText()))
				{
					int selected = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
					
					//Send to the Controller to modify the Pokemon
					appController.updateSelected(selected, health, attack, evolvable, modifier, name);
				}
			}
		});
	}
	
	
	
	
	private void updatePokedexInfo(int index)
	{
		// Update basic fields
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		//Update Text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}
	
	
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "Default Logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
	
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}

}
