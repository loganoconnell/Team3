import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		MainFrame frame = new MainFrame();

		int x = 5;
		int y = 5;

		Ghost ghost = frame.addGhost(new Location(x, y), "ghost", Color.red);
		PacMan pacman1 = frame.addPacMan(new Location(x+1, y));
		PacMan pacman2 = frame.addPacMan(new Location(x-2, y));
	
		assertTrue(pacman1.is_ghost_in_range());
		assertFalse(pacman2.is_ghost_in_range());
	}
}

