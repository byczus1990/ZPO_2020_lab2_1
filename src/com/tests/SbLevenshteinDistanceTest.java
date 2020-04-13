package com.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.SbLevenshteinDistance;

class SbLevenshteinDistanceTest {

	SbLevenshteinDistance levDistance = new SbLevenshteinDistance();
	
	@Test
	public void testGenerateHashMap()
	{
		levDistance.generateHashMap();
		assertTrue(!levDistance.getBasicMap().isEmpty());
	}
	@Test
	public void testGetLevDist() 
	{
		levDistance.generateHashMap();
		assertEquals(1.5, levDistance.getLevDist("kot", "kita"));
		assertEquals(2, levDistance.getLevDist("drab", "dal"));
		assertEquals(0, levDistance.getLevDist("kot", "kot"));
		assertEquals(3, levDistance.getLevDist("kot", "bal"));


	}
	

}
