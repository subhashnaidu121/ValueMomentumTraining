package com.vm.training.java.assignments;
import java.util.*;
public class TestScoreAnalyzer {

	private static int runs;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> data=new LinkedList<Integer>();
		ScoreAnalyzer scoreanalyzer=new ScoreAnalyzer(data);
		while(true)
		{
			System.out.println("Enter runs");
			int runs;
			runs=sc.nextInt();
			if(runs==-1)
			{
				break;
			}
			else
			{
				scoreanalyzer.addRunsToList(runs);
			}
		}
		System.out.println("Runs scored:"+scoreanalyzer.displayRuns());
		
		//double rr=scoreanalyzer.CalcRunRate(runs);
		System.out.println("Runs scored:"+scoreanalyzer.CalcRunRate(runs));
		
		//int lowest=scoreanalyzer.lowestRunsScored(runs);
		System.out.println("Lowest runs:"+scoreanalyzer.lowestRunsScored(0));
		
		System.out.println("count  of players who batted:"+scoreanalyzer.runsData.size());
		
	}
}

