/**
 * 
 */
package charlieteam;

import java.util.ArrayList;

/**
 * @author Charlie Team
 *
 */
public class Subdivision
{

	// instance variable
	private ArrayList<House> houses = new ArrayList<>();

	// default constructor
	public Subdivision()
	{
	}

	// Adds a house to the subdivision
	public boolean add(House h)
	{
		houses.add(h);
		if (houses.contains(h))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// Accessor method to get a house object
	public House get(int i)
	{
		return houses.get(i);
	}

	public int size()
	{
		return houses.size();
	}

	// Returns list of houses
	public ArrayList<House> list()
	{
		return houses;
	}

	// overrides toString() and returns a string of house objects in the
	// subdivision
	public String toString()
	{
		String str = "";
		for (House element : houses)
		{
			str += element + "\n\n";
		}
		return str;
	}

	// returns true or false if a given String characteristic is found
	public boolean find(String characteristic)
	{
		return this.toString().contains(characteristic);
	}
}
