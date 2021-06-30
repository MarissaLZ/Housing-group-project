package charlieteam;

import java.util.Scanner;

public class HouseTester
{

	public static void main(String[] args)
	{
		Scanner userIn = new Scanner(System.in);
		
		System.out.print("Enter style, number of berooms, family room area," 
						   + "living room area, and plot size: ");
		
		//creates house object
		House test1 = new House();
		
		//sets data for house based on user input
		test1.setStyle(userIn.next());
		test1.setBedrooms(userIn.nextInt());
		test1.setFamilRoomArea(userIn.nextDouble());
		test1.setLivingRoomArea(userIn.nextDouble());
		test1.setPlot(userIn.nextDouble());
		
		System.out.print("Enter style, number of berooms, family room area," 
				   + "living room area, and plot size: ");
		
		//creates second house object
		House test2 = new House();
		
		//sets data for house based on user input
		test2.setStyle(userIn.next());
		test2.setBedrooms(userIn.nextInt());
		test2.setFamilRoomArea(userIn.nextDouble());
		test2.setLivingRoomArea(userIn.nextDouble());
		test2.setPlot(userIn.nextDouble());
		
		//prints message for house 1
		System.out.println(test1.toString());
		
		//prints message for house 2
		System.out.println(test2.toString());
		
		//prints result of comparison
		System.out.println("House 1 compared to House 2: " + test1.compareArea(test2));
		
		//close input
		userIn.close();

	}

}
