public class LotteryTicket{
	private String nameofBuyer;
	private int [] numberList;
	
	private boolean search(int toFind) {
		if(toFind>=1 && toFind<=50) {
			for (int i = 0; i<numberList.length;i++) {
				if(numberList[i] == toFind) {
					return true;
				}
			}
			return false;
		}
		else 
		return false;
	}
	
	public LotteryTicket(String name) {
		nameofBuyer = name;
		numberList = new int[10];
		int temp = 0;
		for(int i = 0;i<numberList.length;i++) {
			temp = (int) (Math.random()*50);
			if(i>0) {
				if(search(temp)) {
					i--;
				}
				else {
					numberList[i] = temp;
				}
				
			}
			else {
				numberList[i] = temp;
			}
			
			
	}
	} 
	public double getPercentThatMatch(int [] winningNumbers) {
		int count = 0;
		if(winningNumbers.length == 10) {
		for(int i = 0;i<winningNumbers.length; i++ ) {
			if (search(winningNumbers[i])) {
				count++;
			}
		}
		return (count/numberList.length);
		
	}
		else{
			System.out.println("You must have winning numbers be at length 10!");
			return 0;
		}
	}
}