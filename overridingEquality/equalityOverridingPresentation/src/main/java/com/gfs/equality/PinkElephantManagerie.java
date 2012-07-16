package com.gfs.equality;

import java.util.ArrayList;
import java.util.Collection;

public class PinkElephantManagerie {

	private Collection<PinkElephant> pinkElephants = new ArrayList<PinkElephant>();
	
	public void populate(int age) {
		pinkElephants.add(new PinkElephant(3, 1000, age, 'M'));
	}
	
}
