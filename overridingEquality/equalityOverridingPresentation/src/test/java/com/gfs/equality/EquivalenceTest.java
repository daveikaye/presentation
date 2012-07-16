package com.gfs.equality;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EquivalenceTest {

	private Point p;
	private ColoredPoint redP;
	private ColoredPoint blueP;
	
	@Before
	public void setup() {
		p = new Point(1,2);
		redP = new ColoredPoint(1, 2, Color.RED);
		blueP = new ColoredPoint(1, 2, Color.BLUE);
	}
	
	@Test
	public void passesReflexivity() throws Exception {
		assertThat(p.equals(p), is(true));
		assertThat(redP.equals(redP), is(true));
	}

	@Test
	public void passesSymmetricity() throws Exception {
		assertThat(p.equals(redP), is(redP.equals(p)));
	}
	
	@Test
	public void passesTransitivity() throws Exception {
		assertThat(redP.equals(p), is(false));
		assertThat(blueP.equals(p), is(false));
		assertThat(redP.equals(blueP), is(false));
	}
	
	@Test
	public void passesNullTest() throws Exception {
		assertThat(p.equals(null), is(false));
	}
	
}
