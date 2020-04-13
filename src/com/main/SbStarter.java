package com.main;

public class SbStarter {

	public static void main(String[] args) {
	
		SbLevenshteinDistance levDistance = new SbLevenshteinDistance();
		levDistance.generateHashMap();
		
		System.out.print(levDistance.getLevDist("kot", "kita") );
		System.out.print(levDistance.getLevDist("drab", "dal") );
	
	}
}
