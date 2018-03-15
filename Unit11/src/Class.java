//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String myname;
	private Student[] studentList;
	
	public Class()
	{
		myname="AP Comp Sci A";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		myname = name;
		studentList = new Student[stuCount];

	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;


	}
	
	public String getClassName()
	{
	   return myname;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double sum = 0.0;
		for(int i = 0;i<studentList.length;i++) {
			sum = sum + studentList[i].getAverage();
		}

		classAverage = sum/studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int holder = 0;
		for(int i = 0;i<studentList.length;i++) {
			if(studentList[i].getName().equals(stuName)) {
				holder = i;
			}
		}



		return studentList[holder].getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0;i<studentList.length;i++) {
			if(studentList[i].getAverage()>high) {
				high = studentList[i].getAverage();
			}
		}
		
		for (int g = 0;g<studentList.length;g++) {
			if(high ==studentList[g].getAverage()) {
				hName = studentList[g].getName();
			}
		}





		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i = 0; i < studentList.length; i++)
		{
			if (studentList[i].getAverage() < low)
			{
				hName = studentList[i].getName();
			}
				
		}
		

		return hName;

	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.length; i++)
		{
			if (studentList[i].getAverage() <= failingGrade)
			{
				output = output + studentList[i].getName();
			}
				
		}


		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";




		return output;
	}  	
}