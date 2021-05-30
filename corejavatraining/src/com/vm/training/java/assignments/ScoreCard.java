package com.vm.training.java.assignments;

import java.util.*;
public class ScoreCard {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Map<String, Integer> players=new TreeMap<String, Integer>();
	System.out.println("enter runs scored:");
	
	while(true)
	{
		String name=sc.next();
		if(name.equals("0"))
		{
			break;
		}
		else
		{
			System.out.println("enter runs scored by"+name+": ");
			int runs=sc.nextInt();
			players.put(name, runs);
		}
		
	}
	System.out.println("players who batted:");
	 Iterator<String> itr = players.keySet().iterator();
     while (itr.hasNext()) {
         System.out.println(itr.next());
     }
     System.out.println("total score:");
     int total=0;
     for(Integer i:players.values()) 
     {
    	 total=total+i;
     }
     System.out.println(total);
     System.out.println("highest runs scored:"+Collections.max(players.values()));
     int highestruns=Collections.max(players.values());
     for(Map.Entry<String, Integer> i:players.entrySet())
     {
    	 if(i.getValue()==highestruns)
    	 {
    		 System.out.println("name of highest scorer:"+i.getKey());
    	 }
     }
     System.out.println("runs scored by dhoni:"+players.get("dhoni"));
     
}
}
