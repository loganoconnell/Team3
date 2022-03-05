import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException {
		MainFrame frame = new MainFrame();

		int x = 5;
		int y = 5;
		Ghost ghost = frame.addGhost(new Location(x, y), "ghost", Color.red);
		PacMan pacman = frame.addPacMan(new Location(x+1, y));

		assertTrue(ghost.move());
		assertTrue(pacman.move());
	}
}
