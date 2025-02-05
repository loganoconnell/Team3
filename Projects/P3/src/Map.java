import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		locations.replace(name, loc);

		JComponent temp = components.get(name);
		temp.setLocation(loc.x, loc.y);
		components.replace(name, temp);

		field.get(loc).add(type);

		return false;
	}
	
	public HashSet<Type> getLoc(Location loc){
		//wallSet and emptySet will help you write this method
		if (field.containsKey(loc)) {
			return field.get(loc.shift(1, 1));
		}

		return wallSet;

	}

	public boolean attack(String Name) {
		//update gameOver
		Location loc = locations.get(Name);
		if(loc == null) {
			return false;
		}
		
		if(field.get(loc.shift(-1, 0)).contains(Type.PACMAN) || field.get(loc.shift(0, -1)).contains(Type.PACMAN) ||
		   field.get(loc.shift(1, 0)).contains(Type.PACMAN) || field.get(loc.shift(0, 1)).contains(Type.PACMAN)) {
			gameOver = false;
			return false;
		}
		return true;
	}
	
	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		Location loc = locations.get(name);
		if(getLoc(loc).contains(Map.Type.COOKIE)) {
			String cookieID = "tok_x" + loc.x + "_y" + loc.y;
			locations.remove(cookieID);
			cookies--;
			return components.remove(cookieID);
		}
		return null;
	}
}
