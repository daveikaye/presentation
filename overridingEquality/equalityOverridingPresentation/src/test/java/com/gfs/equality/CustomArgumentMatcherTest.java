package com.gfs.equality;

import static com.gfs.equality.matchers.YoungPinkElephant.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomArgumentMatcherTest {

	@InjectMocks private PinkElephantManagerie sut;
	
	@Mock private Collection<PinkElephant> pinkElephants; 
	
	@Test
	public void pinkElephantIsYoung() throws Exception {
		sut.populate(29);
		verify(pinkElephants).add(argThat(youngPinkElephant()));
	}

	@Test
	public void pinkElephantIsOld() throws Exception {
		sut.populate(30);
		verify(pinkElephants).add(argThat(youngPinkElephant()));
	}
}
