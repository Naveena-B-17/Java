package forLooping;
import java.util.Scanner;
public class Ran {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+x+(x*i));
			
		}
	}
}
