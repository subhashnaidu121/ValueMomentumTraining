package com.vm.training.java.assignments;


import java.util.Comparator;

public class PatientAgeSort implements Comparator<Patient>{


	public int compare (Patient o1,Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
		{
			return 0;
		}
		else if(o1.getAge()>o2.getAge())
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}

}
