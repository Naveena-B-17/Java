package basics;
import java.util.Scanner;
public class Ascii {
	public static void main(String []args) {
		//char ch='A';
		//System.out.println((char)(ch+32));
		Scanner s=new Scanner(System.in);
		char ch;
		ch=s.next().charAt(0);
		int val=(int)ch;
		int small= val+32;
		char c=(char)small;
		System.out.println(c);
		s.close();
	}
}
