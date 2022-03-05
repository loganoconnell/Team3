import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		MainFrame mf = new MainFrame();

		PacMan pc = mf.addPacMan(new Location(1, 1));

		assertTrue(pc.move());
		assertTrue(pc.myLoc.equals(new Location(1, 2)) || pc.myLoc.equals(new Location(2, 1)));
	}
}
