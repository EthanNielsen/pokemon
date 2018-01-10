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
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -39, SpringLayout.EAST, this);
		attackField = new JTextField();
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -39, SpringLayout.EAST, this);
		healthField = new JTextField();
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, -6, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);
		modifierField = new JTextField();
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 180, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, attackField, -6, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, numberField);
		
		descriptionArea = new JTextArea();
		typeArea = new JTextArea();
		
		saveButton = new JButton();
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -10, SpringLayout.EAST, this);
		clearButton = new JButton();
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 189, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 264, SpringLayout.WEST, this);
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 150, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 10, SpringLayout.WEST, this);
		
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 6, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, firstType, 0, SpringLayout.EAST, numberField);
		secondType = new JPanel();
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, -48, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -248, SpringLayout.WEST, modifierField);
		thirdType = new JPanel();
		appLayout.putConstraint(SpringLayout.EAST, thirdType, 0, SpringLayout.EAST, clearButton);
		fourthType = new JPanel();
		appLayout.putConstraint(SpringLayout.WEST, secondType, 6, SpringLayout.EAST, fourthType);
		appLayout.putConstraint(SpringLayout.NORTH, fourthType, -10, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, 45, SpringLayout.SOUTH, modifierField);
		
		setupPanel();
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
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 52, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -126, SpringLayout.EAST, this);
		
		this.add(evolvableBox);
		nameField = new JTextField();
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, 0, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, -28, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -6, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, numberField);
		this.add(nameField);
		
		iconLabel_1 = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 67, SpringLayout.SOUTH, iconLabel_1);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 0, SpringLayout.WEST, iconLabel_1);
		appLayout.putConstraint(SpringLayout.EAST, fourthType, 52, SpringLayout.WEST, iconLabel_1);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 258, SpringLayout.EAST, iconLabel_1);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel_1, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel_1, -21, SpringLayout.NORTH, pokedexDropdown);
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
	
	private void updateImage()
	{
		
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
