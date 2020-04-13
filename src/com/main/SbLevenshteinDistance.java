package com.main;

import java.util.HashMap;
import java.util.Map;

public class SbLevenshteinDistance {
	
	
private Map<String, String[]> basicMap = new HashMap<String, String[]>();

		
	public double getLevDist(String first, String second)
	{
		int i, j, m, n;
		double cost;
	    double matrix[][];

		   m = first.length();
		   n = second.length();
		   
		   matrix = new double[m+1][n+1];

		   for (i=0; i<=m; i++)
		   {
			   matrix[i][0] = i;
		   }
		   
		   for (j=1; j<=n; j++)
		   {
			   matrix[0][j] = j;
		   }		      

		   for (i=1; i<=m; i++)
		   {
		      for (j=1; j<=n; j++)
		      {
		    	  String[] valueOfKey = basicMap.get(String.valueOf(first.charAt(i-1)));
		    	  String valueOfKeyString = String.join(" ", valueOfKey);
		           if (first.charAt(i-1) == second.charAt(j-1))
		              cost = 0;
		           else if (valueOfKeyString.contains(String.valueOf(second.charAt(j-1) ) ) )
		        		   {
		        	   			cost = 0.5;
		        		   }
		           else {
			              cost = 1;
		           }

		           matrix[i][j] = Math.min(matrix[i-1][j] + 1,          /* remove */
		                          Math.min(matrix[i][j-1] + 1,      		/* insert */
                        		  matrix[i-1][j-1] + cost));   	/* change */
		      }
		   }

		   return matrix[m][n];
	}
	public void generateHashMap()
	{
		basicMap.clear();
		basicMap.put("q", new String[] {"w"});
		basicMap.put("w", new String[] {"q","e"});
		basicMap.put("e", new String[] {"w","r"});
		basicMap.put("r", new String[] {"e","t"});
		basicMap.put("t", new String[] {"r","y"});
		basicMap.put("y", new String[] {"t","u"});
		basicMap.put("u", new String[] {"y","i"});
		basicMap.put("i", new String[] {"u","o"});
		basicMap.put("o", new String[] {"i","p"});
		basicMap.put("p", new String[] {"o"});
		basicMap.put("a", new String[] {"s"});
		basicMap.put("s", new String[] {"a","d"});
		basicMap.put("d", new String[] {"s","f"});
		basicMap.put("f", new String[] {"d","g"});
		basicMap.put("g", new String[] {"f","h"});
		basicMap.put("h", new String[] {"g","j"});
		basicMap.put("j", new String[] {"k","l"});
		basicMap.put("k", new String[] {"j","l"});
		basicMap.put("l", new String[] {"k"});
		basicMap.put("z", new String[] {"x"});
		basicMap.put("x", new String[] {"z","c"});
		basicMap.put("c", new String[] {"x","v"});
		basicMap.put("v", new String[] {"c","b"});
		basicMap.put("b", new String[] {"v","n"});
		basicMap.put("n", new String[] {"b","m"});
		basicMap.put("m", new String[] {"n"});
	}	
	
	public Map<String, String[]> getBasicMap() {
		return basicMap;
	}
}
