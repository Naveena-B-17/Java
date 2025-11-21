package conditionalStatement;

public class IfElseIf {
	public static void main(String[] args) {
		int marks=34;
		if(marks>=50) {
			System.out.println("PASS");
		}
		else if(marks>=65&&marks<=80) {
			System.out.println("PASS & GOOD");
		}
		else {
			System.out.println("FAIL");
		}
	}
}
