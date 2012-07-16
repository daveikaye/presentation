package com.gfs.equality.matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import com.gfs.equality.PinkElephant;

public class IsPinkElephantEqual extends TypeSafeMatcher<PinkElephant> {

	private final PinkElephant actual;
	
	public IsPinkElephantEqual(PinkElephant actual) {
		this.actual = actual;
	}

	@Override
	public void describeTo(Description description) {
		description.appendValue("height:"+actual.getHeight());
	}

	@Override
	protected boolean matchesSafely(PinkElephant expected) {
		if (actual==null || expected==null) {
			return false;
		}
		
		if (actual==expected) {
			return true;
		}
		
		return actual.getAge()==expected.getAge()
			&& actual.getHeight()==expected.getHeight()	
			&& actual.getSex()==expected.getSex()
			&& actual.getWeight()==expected.getWeight();
	}
	
	@Factory
	public static <T> Matcher<PinkElephant> pinkElephantEqual(PinkElephant actual) {
		return new IsPinkElephantEqual(actual);
	}

}
