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

	// Step 3.
	// returns an array of all the houses that the total area are equal to or between the given floor and ceiling 
	public ArrayList<House> listByArea(double floor, double ceiling){
		ArrayList<House> areaList = new ArrayList<>();
		for (int i = 0; i < houses.size(); i++) {
			if (houses.get(i).getTotalArea() >= floor && houses.get(i).getTotalArea() <= ceiling ){
				areaList.add(houses.get(i));
			}
		}
		return areaList;	
		
	}
	// returns an array of all the houses that the plot size are equal to or between the given floor and ceiling 
	public ArrayList<House> listByPlot(double floor, double ceiling){
		ArrayList<House> plotList = new ArrayList<>();
		for (int i = 0; i < houses.size(); i++) {
			if (houses.get(i).getPlot() >= floor && houses.get(i).getPlot() <= ceiling ){
				plotList.add(houses.get(i));
			}
		}
		return plotList;
		
	}
	// returns a sorted array by the total area from smallest to largest
	public ArrayList<House> sortByArea(){
		ArrayList<House> areaSort = new ArrayList<>(houses);
		for (int i = 0; i < areaSort.size(); i++) {
			House hMinArea = areaSort.get(i);
			int minIndex = i;
			for (int j = i + 1; j < areaSort.size(); j++) {
				 if (hMinArea.getTotalArea() > areaSort.get(j).getTotalArea()) {
					 hMinArea = areaSort.get(j);
					 minIndex = j;
				 }
			}
			if (minIndex != i) {
				areaSort.set(minIndex, areaSort.get(i));
				areaSort.set(i, hMinArea);
				
			}
			
		}
 		return areaSort;
		
	}
	// returns a sorted array by the plot size from smallest to largest
	public ArrayList<House> sortByPlot(){
		ArrayList<House> plotSort = new ArrayList<>(houses);
		for (int i = 0; i < plotSort.size(); i++) {
			House hMinArea = plotSort.get(i);
			int minIndex = i;
			for (int j = i + 1; j < plotSort.size(); j++) {
				 if (hMinArea.getPlot() > plotSort.get(j).getPlot()) {
					 hMinArea = plotSort.get(j);
					 minIndex = j;
				 }
			}
			if (minIndex != i) {
				plotSort.set(minIndex, plotSort.get(i));
				plotSort.set(i, hMinArea);
				
			}
			
		}
 		return plotSort;
		
	}
	// Step 4.
}
