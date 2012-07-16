package com.gfs.equality;

import static com.gfs.equality.matchers.IsPinkElephantEqual.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomMatcherTest {

	private PinkElephant elephant1 = new PinkElephant(3, 1000, 50, 'F');
	private PinkElephant elephant2 = new PinkElephant(3, 1000, 50, 'F');
	private PinkElephant elephant3 = new PinkElephant(4, 1100, 67, 'M');
	
	@Test
	public void comparesPinkElephants() throws Exception {
		assertThat(elephant1, is(pinkElephantEqual(elephant2)));
		assertThat(elephant1, is(pinkElephantEqual(elephant3)));
	}
	
}
