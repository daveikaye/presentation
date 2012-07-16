package com.gfs.equality.matchers;

import org.mockito.ArgumentMatcher;

import com.gfs.equality.PinkElephant;

public class YoungPinkElephant extends ArgumentMatcher<PinkElephant>{

	@Override
	public boolean matches(Object argument) {
		return argument instanceof PinkElephant;
	}
	
	public static YoungPinkElephant youngPinkElephant() {
		return new YoungPinkElephant();
	}
	
}
