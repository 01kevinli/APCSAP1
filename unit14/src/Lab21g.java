//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter test = new AtCounter();
		test.countAts(3,1);
		out.println("3 1 has " + test);
		
		AtCounter test1 = new AtCounter();
		test1.countAts(0,0);
		out.println("0 0 has " + test1);
		
		AtCounter test2 = new AtCounter();
		test2.countAts(4,1);
		out.println("4 1 has " + test2);
		
		AtCounter test3 = new AtCounter();
		test3.countAts(9,9);
		out.println("9 9 has " + test3);
		
		AtCounter test4 = new AtCounter();
		test4.countAts(4,3);
		out.println("4 3 has " + test4);
	}
}