import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame nf = new NoFrame();
		Map map = nf.getMap();
		
		PacMan pacman = nf.addPacMan(new Location(1, 1));
		
		assertTrue(map.getLoc(pacman.myLoc).contains(Map.Type.COOKIE));
		assertNotNull(pacman.consume());

		assertFalse(map.getLoc(pacman.myLoc).contains(Map.Type.COOKIE));
		assertNull(pacman.consume());
	}
}
