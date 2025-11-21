package methods;

import java.util.Scanner;

public class Prime{
	boolean check(int a) {
		for(int i=2;i<=a/2;i++) {
			int prim=a%i;
			if(prim!=0) {
				return false;
			}
		}return true;
	}    
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Prime p=new Prime();
		System.out.println("Enter a: ");
		int a=s.nextInt();
		p.check(a);
		System.out.println();
	}
}
