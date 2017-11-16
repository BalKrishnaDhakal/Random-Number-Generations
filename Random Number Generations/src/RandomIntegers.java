import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
	
		SecureRandom randomNumbers = new SecureRandom();
		for(int counter=1; counter<=20; counter++) {
			int face = 1 + randomNumbers.nextInt(6);// pick random numbers from 1 to 6
			
			System.out.printf("%d ",face);// Display generated values
			// if the counter is divisible by 5, starts a new line to print--
			if(counter %5==0)
				System.out.println();
		}
			
	}

}
