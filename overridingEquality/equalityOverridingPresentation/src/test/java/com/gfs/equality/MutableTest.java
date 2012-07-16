package com.gfs.equality;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class MutableTest {
	
	private Point p;
	private Collection<Point> points;
	
	@Before
	public void setup() {
		p = new Point(1, 2);
		points = new HashSet<Point>(Arrays.asList(p));
	}

	@Test
	public void failsDueToMutability() throws Exception {
		assertThat(points.contains(p), is(true));
		
		p.setX(2);
		
		assertThat(points.contains(p), is(true));
	}
	
}
