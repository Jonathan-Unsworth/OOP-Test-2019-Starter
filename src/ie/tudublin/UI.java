package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	public static ArrayList<Colour> colours = new ArrayList<Colour>();
	public static ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	private int hundreds, tens, ones;


	public void separate(int value)
	{
		hundreds = (value / 100);
		tens = (value - (hundreds * 100)) / 10;
		ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void loadColours() {
		Table table = loadTable("colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            Colour c = new Colour(tr);
            colours.add(c);
        }       
	}

	public void loadResistors() {
		Table table = loadTable("resistors.csv");
        for(TableRow tr:table.rows())
        {
            Resistor r = new Resistor(tr);
            resistors.add(r);
        }       
	}

	public void printColours() {
		for(Colour c : colours) {
            System.out.println(c);
        }
	}

	public Colour findColour(int value) {
		return colours.get(value);
	}


	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();
		loadResistors();
	}
	
	public void draw()
	{		
		for(Resistor r : resistors) {
			rect(width - 400, height - 100, 100, 100);
			fill(findColour(hundreds), findColour(tens), findColour(ones));
			rect(width - 390, height - 100, 15, 15);
			fill(findColour(hundreds), findColour(tens), findColour(ones));
			rect(width - 350, height - 100, 15, 15);
			fill(findColour(hundreds), findColour(tens), findColour(ones));
			rect(width - 320, height - 100, 15, 15);
			line();
			line()
		}	
	}
}
