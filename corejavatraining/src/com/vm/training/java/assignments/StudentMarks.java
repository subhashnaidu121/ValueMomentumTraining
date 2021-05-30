package com.vm.training.java.assignments;

import java.util.*;
public class StudentMarks {
Scanner sc=new  Scanner(System.in);
 
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		ArrayList<Integer> marks=new ArrayList<Integer>();
		int n;
		n=sc.nextInt();
		int m;
		for(int i=0;i<n;i++)
		{
			m=sc.nextInt();
			marks.add(m);
		}
		
		
		Comparable max = Collections.max(marks);
		System.out.println("Highest Marks:"+max);
		int sum=0;
		double avg=0;
		for(int i=0;i<marks.size();i++)
		{
			sum=sum+ marks.get(i);
			avg=sum/marks.size();
			
		}
		System.out.println("average:"+avg);
		for(int i=0;i<marks.size();i++)
		{
		System.out.print((i+1)+"-"+marks.get(i)+" ");
		}
		
		//int position =marks.indexOf(2);
		System.out.println("\n3rd sudent marks:"+marks.get(3));
	    
		Collections.sort(marks);
		for(int i=0;i<marks.size();i++)
		{
		System.out.print((i+1)+"-"+marks.get(i)+" ");
		}
	}
	
}
