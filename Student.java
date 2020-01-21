package com.map;


import java.util.HashMap;

import java.util.Map;
import java.util.stream.Collectors;

public class Student {

	public static void main(String args[]){  
		Map<String,Integer> markSheet=new HashMap<String,Integer>();          
		markSheet.put("Akila",45);
		markSheet.put("Amaya",55);
		markSheet.put("Sepalika",65);
		markSheet.put("Mekala",75);
		markSheet.put("Jayalath",65);
		markSheet.put("Senal",78);
		markSheet.put("Vindya",66);
		markSheet.put("Kalum",54);
		     
		    
		      
		    //  List<Integer> Passed = map.values().stream().filter(mark -> mark >60).collect(Collectors.toList());
		    
		      
		      Map<String,Integer> result= markSheet.entrySet()
		    	     .stream()
		    	     .filter(map -> map.getValue().intValue()>60)
		    	     
		    	     .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		    	    		 
		    	    
		         
		    
		     System.out.println("processed map: " + result);
		      
		
		      
		      }
		      
		      
		      
		 }  
	
	 


