package pokemon.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import pokemon.model.Pokemon;

public class FileController 
{
	// This is how to read and write a file in Java.
	
	public static void savePokemonToFile(ArrayList<Pokemon> pokedex)
	{
		File saveFile = new File("Saved Pokedex.txt");
		try
		{
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			
			// Loops through all the writing...
			for (int index = 0; index < pokedex.size(); index++)
			{
				String name = pokedex.get(index).getName();
				int number = pokedex.get(index).getNumber();
				int attack = pokedex.get(index).getAttackPoints();
				int health = pokedex.get(index).getHealthPoints();
				boolean evolve = pokedex.get(index).isCanEvolve();
				double modify = pokedex.get(index).getEnhancementModifier();
				
				String row = name + "," + number + "," + health + "," + attack + "," + evolve; // CSV
				
				writeToDisk.println(row);
			}
			// Closes once all the writing is finished.
			writeToDisk.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println("There was an error:" + error.getMessage());
		}
	}
	
	public static String readPokemonFrameFile()
	{
		String contents = "";
		String path = "Saved pokedex.txt";
		try
		{
			Scanner fileScanner = new Scanner(new File(path));
			while(fileScanner.hasNextLine())
			{
			String row = fileScanner.nextLine();
			contents += row + "\n";
			}
			fileScanner.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println("There was an error:" + error.getMessage());
		}

		return contents;
	}

}
