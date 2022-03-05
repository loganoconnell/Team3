import junit.framework.*;
import org.junit.Assert;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		assertTrue(frame.getMap().getLoc(3,3) == Map.Type.EMPTY);
		assertTrue(frame.getMap().getLoc(3,2) == Map.Type.WALL);
	}
}
