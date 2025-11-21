package conditionalStatement;
import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int marks;
		marks=s.nextInt();
		if(marks>=0&&marks<=100) {
			if(marks>=50) {
				System.out.println("PASS");
			}
			else {
				System.out.println("FAIL");
			}
		}
		else {
			System.out.println("INVALID");
		}
		s.close();
	}
}
