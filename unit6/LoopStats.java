//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		setNums(0,10);

	}

	public LoopStats(int beg, int end)
	{
		setNums(beg,end);


	}

	public void setNums(int beg, int end)
	{
	start = beg;
	stop = end;


	}

	public int getEvenCount()
	{
		int evenCount=0;
		for(int i = beg;i<end;i++) {
			if(i%2==0) {
				evenCount++;
			}
			
		}




		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		public int getOddCount()
		{
			int OddCount=0;
			for(int i = beg;i<end;i++) {
				if(i%2==1) {
					oddCount++;
				}
				
			}




			return evenCount;
		}




		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for(int i = beg;i<end;i++) {
			total = total + i;
		}



		return total;
	}
	
	public String toString()
	{
		return start + " to " + stop+ ", total odds: "+ getOddCount+ " total evens: "+getEvenCount+" total: " + getTotal;
	}
}