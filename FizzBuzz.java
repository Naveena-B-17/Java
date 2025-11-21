package conditionalStatement;
import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int x=s.nextInt();
		if ((x%3==0)&&(x%5==0)){
			System.out.println("FIZZ BUZZ");
		else if (x%3==0) {
			System.out.println("FIZZ");
		}
		else if (x%5==0) {
			System.out.println("BUZZ");
		}
		else {
			System.out.println("Not divible by 3&5");
		}
	}
		s.close();
	}
}
