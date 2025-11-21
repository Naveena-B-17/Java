package forLooping;
import java.util.Scanner;
public class PerfectNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int n=28;
		int i;
		int sum=0;
		int count=0;
		for(i=1;i<n;i++) {
			if(n%i==0) {
				count++;
				sum=sum+i;
				System.out.println(i);	
			}
		}
		System.out.println(count);
		if(sum==n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not A Perfect Number");
		}
		
	}
	
}
