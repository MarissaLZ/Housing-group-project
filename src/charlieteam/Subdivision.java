/**
 * 
 */
package charlieteam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Charlie Team
 *
 */
public class Subdivision
{

	// instance variable
	private ArrayList<House> houses = new ArrayList<>();

	// default constructor
	/**
	 * 
	 */
	public Subdivision()
	{
	}

	// Adds a house to the subdivision
	/**
	 * 
	 * @param h
	 * @return
	 */
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
	/**
	 * 
	 * @param i
	 * @return
	 */
	public House get(int i)
	{
		return houses.get(i);
	}

	/**
	 * 
	 * @return
	 */
	public int size()
	{
		return houses.size();
	}

	// Returns list of houses
	/**
	 * 
	 * @return
	 */
	public ArrayList<House> list()
	{
		return houses;
	}

	// overrides toString() and returns a string of house objects in the
	// subdivision
	/**
	 * 
	 */
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
	/**
	 * 
	 * @param characteristic
	 * @return
	 */
	public boolean find(String characteristic)
	{
		return this.toString().contains(characteristic);
	}

	// Step 3.
	// returns an array of all the houses that the total area are equal to or
	// between the given floor and ceiling
	/**
	 * 
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	public ArrayList<House> listByArea(double floor, double ceiling)
	{
		ArrayList<House> areaList = new ArrayList<>();
		for (int i = 0; i < houses.size(); i++)
		{
			if (houses.get(i).getTotalArea() >= floor
					&& houses.get(i).getTotalArea() <= ceiling)
			{
				areaList.add(houses.get(i));
			}
		}
		return areaList;

	}

	// returns an array of all the houses that the plot size are equal to or
	// between the given floor and ceiling
	/**
	 * 
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	public ArrayList<House> listByPlot(double floor, double ceiling)
	{
		ArrayList<House> plotList = new ArrayList<>();
		for (int i = 0; i < houses.size(); i++)
		{
			if (houses.get(i).getPlot() >= floor
					&& houses.get(i).getPlot() <= ceiling)
			{
				plotList.add(houses.get(i));
			}
		}
		return plotList;

	}

	// returns a sorted array by the total area from smallest to largest
	/**
	 * 
	 * @return
	 */
	public ArrayList<House> sortByArea()
	{
		ArrayList<House> areaSort = new ArrayList<>(houses);
		for (int i = 0; i < areaSort.size(); i++)
		{
			House hMinArea = areaSort.get(i);
			int minIndex = i;
			for (int j = i + 1; j < areaSort.size(); j++)
			{
				if (hMinArea.getTotalArea() > areaSort.get(j).getTotalArea()) // TODO:
																			  // Fix
																			  // to
																			  // use
																			  // House.compareArea()
																			  // for
																			  // the
																			  // sorting
				{
					hMinArea = areaSort.get(j);
					minIndex = j;
				}
			}
			if (minIndex != i)
			{
				areaSort.set(minIndex, areaSort.get(i));
				areaSort.set(i, hMinArea);

			}

		}
		return areaSort;

	}

	// returns a sorted array by the plot size from smallest to largest
	/**
	 * 
	 * @return
	 */
	public ArrayList<House> sortByPlot()
	{
		ArrayList<House> plotSort = new ArrayList<>(houses);
		for (int i = 0; i < plotSort.size(); i++)
		{
			House hMinArea = plotSort.get(i);
			int minIndex = i;
			for (int j = i + 1; j < plotSort.size(); j++)
			{
				if (hMinArea.getPlot() > plotSort.get(j).getPlot())
				{
					hMinArea = plotSort.get(j);
					minIndex = j;
				}
			}
			if (minIndex != i)
			{
				plotSort.set(minIndex, plotSort.get(i));
				plotSort.set(i, hMinArea);

			}

		}
		return plotSort;

	}

	// Step 4.
	/**
	 * 
	 * @return
	 */
	public boolean toDisk()
	{
		File txt = new File("subdivision.txt"); // Ask if this should be an
												// static private variable?
		try
		{
			try (PrintWriter out = new PrintWriter(txt);)
			{
				for (int i = 0; i < houses.size(); i++)
				{
					out.println(houses.get(i).getStyle() + ','
							+ houses.get(i).getFamilyRoomArea() + ','
							+ houses.get(i).getLivingRoomArea() + ','
							+ houses.get(i).getBedrooms() + ','
							+ houses.get(i).getPlot());
				}
				return true;
			}
		}
		catch (IOException e)
		{
			return false;
		}

	}

	/**
	 * 
	 * @return
	 */
	public boolean fromDisk()
	{
		File txt = new File("subdivision.txt"); // Same variable
		try
		{
			try (Scanner readin = new Scanner(txt);)
			{
				for (int i = 0; readin.hasNext(); i++)
				{
					String[] line = readin.nextLine().split(",");
					houses.add(i,
							new House(line[0], Double.parseDouble(line[1]),
									Double.parseDouble(line[2]),
									Integer.parseInt(line[3]),
									Double.parseDouble(line[4])));
				}

			}
			return true;
		}
		catch (FileNotFoundException e)
		{
			return false;
		}
	}

	/**
	 * 
	 * @param position
	 */
	public void remove(int position)
	{
		houses.remove(position);
	}

	/**
	 * 
	 * @param position
	 * @param houseToUpdate
	 */
	public void update(int position, House houseToUpdate)
	{
		this.remove(position);
		houses.add(position, houseToUpdate);
	}
}
