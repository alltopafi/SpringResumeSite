package com.alltopafi.jesse.model.projects;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ResumeSiteTest {

	@Mock
	private ResumeSite resumeSite;
	
	@Before
	public void setup() {
		resumeSite = mock(ResumeSite.class);
	}
	
	@Test
	public void test() {
		assertNotNull(resumeSite);
	}
}
