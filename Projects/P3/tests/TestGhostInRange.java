import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		MainFrame mf = new MainFrame();

		mf.addPacMan(new Location(1, 1));
		Ghost gh = mf.addGhost(new Location(1, 2), "inky", Color.CYAN);

		assertTrue(gh.is_pacman_in_range());
	}
}

