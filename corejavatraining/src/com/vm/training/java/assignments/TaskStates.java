package com.vm.training.java.assignments;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class TaskStates {
public static void main(String[] args) throws IOException {
	
	
	File f=new File("C:\\Users\\DELL\\Desktop\\ForFiles\\states.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	
	LinkedHashSet<String> states=new LinkedHashSet<String>();
	
	String line=br.readLine();
	while(line!=null)
	{
		states.add(line);
		line=br.readLine();
	}
	System.out.println("Total no of states:"+states.size());
	System.out.println(states.remove("Delhi"));
	System.out.println(states);
	System.out.println("the names start with k:");
	for (String i : states) {
		
		if(i.startsWith("K"))
		{
			System.out.println(i);
		}
	}
	
	
	
	SortedSet<String> sortstates=new TreeSet<String>(states);
	System.out.println("afer sorting"+sortstates);
	
}
}
