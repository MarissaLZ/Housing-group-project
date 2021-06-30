/**
 * 
 */
package charlieteam;

/**
 * @author Charlie Team
 *
 */
public class House
{
	//Instance Variables
	private int numBedrooms = 0;
	private double familyRoomSize = 0;
	private double livingRoomSize = 0;
	private String style = "";
	private double plotSize = 0;
	
	//constant for bedroom area
	private final int BEDROOM_AREA = 300;
	
	//Default constructor
	House()
	{
		
	}
	
	//Constructor that takes in data
	House(String style, double familyRoomSize, double livingRoomSize, int numBedrooms, double plotSize)
	{
		this.style = style;
		this.familyRoomSize = familyRoomSize;
		this.livingRoomSize = livingRoomSize;
		this.numBedrooms = numBedrooms;
		this.plotSize = plotSize;
	}
	
	//Mutators
	public void setBedrooms(int newBedroom)
	{
		numBedrooms = newBedroom;
	}
	
	public void setFamilRoomArea(double newFamilySize)
	{
		familyRoomSize = newFamilySize;
	}
	
	public void setLivingRoomArea(double newLivingRoom)
	{
		livingRoomSize = newLivingRoom;
	}
	
	public void setPlot(double newPlotSize)
	{
		plotSize = newPlotSize;
	}
	
	public void setStyle(String newStyle)
	{
		style = newStyle;
	}
	
	
	//Getters
	public int getBedrooms()
	{
		return numBedrooms;
	}
	
	public double getFamilyRoomArea()
	{
		return familyRoomSize;
	}
	
	public double getLivingRoomArea()
	{
		return livingRoomSize;
	}
	
	public double getPlot()
	{
		return plotSize;
	}
	
	public String getStyle()
	{
		return style;
	} 
	
	//Method that returns total area of house object
	public double getTotalArea()
	{
		double area = livingRoomSize + familyRoomSize + (BEDROOM_AREA * (double)numBedrooms);
		
		return area;
	}
	
	//Compares the area of two house objects and return a negative if the 
	//area of the first house is smaller, positive if the first house is bigger
	//and 0 if they are the same
	public int compareArea(House otherHouse)
	{
		int result = (int)(this.getTotalArea() - otherHouse.getTotalArea());
		
		return result;
	}
	
	//Returns a message containing all the information on a house object
	public String toString()
	{
		String message = "House style: " + style + "\n"
						 + "Number of bedrooms: " + numBedrooms + "\n"
						 + "Family Room Area: " + familyRoomSize + "\n"
						 + "Living Room Area: " + livingRoomSize + "\n"
						 + "Plot Size: " + plotSize + "\n"
						 + "Total square feet: " + this.getTotalArea();
		
		return message;
	}
}
