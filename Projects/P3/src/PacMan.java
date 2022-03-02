import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> validLocs = new ArrayList<Location>();
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)) == myMap.Type.EMPTY) {
			validLocs.add(new Location(myLoc.x - 1, myLoc.y));
		} 
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)) == myMap.Type.EMPTY) {
			validLocs.add(new Location(myLoc.x + 1, myLoc.y));
		} 
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)) == myMap.Type.EMPTY) {
			validLocs.add(new Location(myLoc.x, myLoc.y - 1));
		} 
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)) == myMap.Type.EMPTY) {
			validLocs.add(new Location(myLoc.x, myLoc.y + 1));
		}

		return validLocs;
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
