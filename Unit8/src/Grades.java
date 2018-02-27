//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	private double [] nums;
	public Grades(double [] grades) {
		
	}
	public void setGrades(double [] grds) {
		nums = grds;
	}
	private double getSum()
	{
		double sum=0.0;
		for(int i = 0; i<nums.length;i++) {
			sum = sum + nums[i];
		}
		

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/nums.length;
		



		return average;
	}


	public String toString() {
		String output = "";
		for(int i = 0;i<nums.length;i++) {
		output = output + "Grade "+i+1+": "+ nums[i]+"\n";	
		}
		
		return output +"average grade: "+getAverage();
		
	}



}