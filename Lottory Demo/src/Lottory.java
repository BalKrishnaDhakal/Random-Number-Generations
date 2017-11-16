import java.util.Scanner;

public class Lottory {
	public static void main(String[] args)
	{
		// Generate a lottery winning number
		int lottery= (int)(Math.random() * 100);
		//prompt for your lottery pick
		System.out.println("Please enter your pick to the lottery: ");
		//create a scanner object
		Scanner input = new Scanner(System.in);
		int pick = input.nextInt();
		//get digits from the lottery winning number
		int lotteryDigit1 =lottery / 10 ;
		int lotteryDigit2 = lottery % 10 ;
		//get digits from the lotteryPick
		int lotteryPickDigit1 = pick /10;
		int lotteryPickDigit2 = pick %10;
		//prompt the user the winning number
		System.out.println("The winning number this week is: " + lottery );
		//check the pick
		if(pick == lottery)
			System.out.println("Exact match: You just won $1000000!!!");
		else if (lotteryPickDigit2 == lotteryDigit1
			     && lotteryPickDigit1 == lotteryDigit2)
			System.out.println("Reverse match: You just won $10000!!!");
		else if(lotteryPickDigit1 == lotteryDigit1
				|| lotteryPickDigit1 == lotteryDigit2
				|| lotteryPickDigit2 == lotteryDigit1
				|| lotteryPickDigit2 == lotteryDigit2)
			System.out.println("One-digit match: You just won $1000!!!");
		
		else
			System.out.println("Don't be sad, good luck next time!!!");
		
		
		
		
	}



}
