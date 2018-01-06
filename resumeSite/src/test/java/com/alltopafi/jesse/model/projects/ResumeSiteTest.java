package com.alltopafi.jesse.model.projects;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ResumeSiteTest {

	private ResumeSite resumeSite;
	
	@Before
	public void setup() {
		resumeSite = new ResumeSite();;
	}
	
	@Test
	public void test() {
		resumeSite.setClassName("Networking");
		resumeSite.setDescription("network stuff");
		resumeSite.setGrade(80);
		resumeSite.setName("thing");
		resumeSite.setTeamMembers(new ArrayList<String>());
		resumeSite.getTeamMembers().add("Sara");
		
		assertEquals("Networking", resumeSite.getClassName());
		assertEquals("network stuff", resumeSite.getDescription());
		assertEquals(80, resumeSite.getGrade());
		assertEquals("thing", resumeSite.getName());
		assertEquals("Sara", resumeSite.getTeamMembers().get(0));
	}
}
