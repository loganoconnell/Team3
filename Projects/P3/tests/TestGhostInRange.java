import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		MainFrame mf = new MainFrame();

		mf.addPacMan(new Location(1, 1));
		Ghost inky = mf.addGhost(new Location(1, 2), "inky", Color.CYAN);
		Ghost blinky = mf.addGhost(new Location(1, 3), "blinky", Color.RED);

		assertTrue(inky.is_pacman_in_range());
		assertFalse(blinky.is_pacman_in_range());
	}
}

