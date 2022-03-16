import junit.framework.*;
import org.junit.Assert;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		assertTrue(frame.getMap().getLoc(new Location(3,3)).contains(Map.Type.EMPTY));
		assertTrue(frame.getMap().getLoc(new Location(3,2)).contains(Map.Type.WALL));
	}
}
