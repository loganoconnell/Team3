import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {
	
	public void testMapEatCookie() {
		MainFrame mf = new MainFrame();

		Map m = mf.getMap();

		Location loc = new Location(1, 1);

		assertTrue(m.getLoc(loc).contains(Map.Type.COOKIE));

		PacMan pc = mf.addPacMan(loc);
		m.eatCookie(pc.myName);

		assertFalse(m.getLoc(loc).contains(Map.Type.COOKIE));
	}
}
