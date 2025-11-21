package basics;
import java.util.Scanner;
public class Scan {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	char s;
	s=sc.next().charAt(2);
	System.out.println(s);
	sc.close();
	}
}