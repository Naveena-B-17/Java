package forLooping;
import java.util.Scanner;
public class PrimeUseBreak {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int num=s.nextInt();
		int num=3;
		boolean flag=true;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(num);
		}
		else {
			System.out.println(num);
		}
		
	}
}
