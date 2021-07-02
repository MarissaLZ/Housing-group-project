/**
 * 
 */
package charlieteam;

/**
 * @author Joe
 *
 */
public class SubDivision {
	/**
	 * @param args
	 */
	 
	 //instance variable
	 //House specifies the type therefore input must be of the class House type
	 private ArrayList<House> houses = new ArrayList<>();

	 
	 //default constructor and we know object is created
	 //should I declare as public?
	 public subDivision () {
	 }
	 
	 
	 //methods
	 //adds a house
	public boolean add(House h) {
	    houses.add(h);
	    
	    if (houses.contains(h)) {
	        return true;
	    } 
	    else {
	        return false;
	    }
	    
        //accessor method to get house object
        public House get(int i) {
            return houses.get(i);
            
        }
        
	    
	    
	    
	     
	 }
	 
}