package charlieteam;

/**
 * Displays menu options on start up
 * Final Step 5
 * 
 * @author Charlie Team
 *
 */

import java.util.*;
public class Menu
{
	public static void main(String[] args) throws InputMismatchException
	{
    		Subdivision subdivision = new Subdivision();
    		
    		String message = "[0] to Exit\r\n"
    				+ "[1] Display All Houses in the Subdivision\r\n"
    				+ "[2] Add a House to the Subdivision\r\n"
    				+ "[3] Delete a House in the Subdivision\r\n"
    				+ "[4] Change a House in the Subdivision\r\n"
    				+ "[5] Filter Subdivision by Total Area and Display\r\n"
    				+ "[6] Filter Subdivision by Plot Size and Display\r\n"
    				+ "[7] Sort Subdivision by Total Area and Display\r\n"
    				+ "[8] Sort Subdivision by Plot Size and Display\r\n"
    				+ "[9] Save Subdivision to Text File\r\n"
    				+ "Enter a number from 0 to 9: ";
    		
    		try(Scanner userIn = new Scanner(System.in))
    		{
    			int user = 0;
    
    			do
    			{
    				System.out.print(message);
    				
    				user = userIn.nextInt();
    				
    				if(user == 1) 
    				{
    					System.out.print(subdivision.toString());
    
    				}
    				
    				else if(user == 2) 
    				{
    					System.out.print("Enter style, family room size, living room size,"
    							+ " number of bedrooms and plot size: ");
    					
    					House newHouse = new House(userIn.next(), userIn.nextInt(), userIn.nextInt(), userIn.nextInt(), userIn.nextInt());
    							
    					subdivision.add(newHouse);
    				}
    				
    				else if(user == 3) 
    				{
    					System.out.print("Enter position of house to remove: ");
    					subdivision.remove(userIn.nextInt());
    				}
    				
    				else if(user == 4) 
    				{
    					System.out.print("Enter position of house to change style and enter new style: ");
    					int position = 0;
    					position = userIn.nextInt();
    	
    					String style = "";
    					style = userIn.next();
    			
    					House updateHouse = subdivision.get(position);
    					
    					updateHouse.setStyle(style);
    					
    					subdivision.update(position, updateHouse);
    				}
    				
    				else if(user == 5) 
    				{
    					System.out.print("Enter floor and ceiling: ");
    					for (House element : subdivision.listByArea(userIn.nextInt(), userIn.nextInt()))
    					{
    						System.out.println(element + "\n");
    					}
    				}
    				
    				else if(user == 6) 
    				{
    					System.out.print("Enter floor and ceiling: ");
    					for (House element : subdivision.listByPlot(userIn.nextInt(), userIn.nextInt()))
    					{
    						System.out.println(element + "\n");
    					}
    				}
    				
    				else if(user == 7) 
    				{
    					for (House element : subdivision.sortByArea())
    					{
    						System.out.println(element + "\n");
    					}
    				}
    				
    				else if(user == 8) 
    				{
    					for (House element : subdivision.sortByPlot())
    					{
    						System.out.println(element + "\n");
    					}
    				}
    				
    				else if(user == 9) 
    				{
    					boolean success = subdivision.toDisk();
    			
            			if (success == true)
            			{
            				System.out.println("You have written the subdivsion to a text file \n");
            			}
            			else
            			{
            				System.out.println("File creation failed");
            			}
    				}	
            		else if(user > 9 || user < 0)
        			{
        				System.out.println("Error! Enter apprioate option.");
        				
        				System.out.print(message);
        				
        				user = userIn.nextInt(); 
        				
    				}
    			
    		
    			}while(user >= 1 && user <=9);
    			
    			if(user == 0)
    			{
    				System.out.print("\nExiting program");
    			}

    		
    		} catch( InputMismatchException e)
    			{
    				System.out.println("Error! Enter apprioate option.");
    			}


	}

}
