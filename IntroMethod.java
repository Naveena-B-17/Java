package methods;

import java.util.Scanner;

public class IntroMethod {
	void addd() {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		IntroMethod i=new IntroMethod ();
		i.addd();
	}
}
	

