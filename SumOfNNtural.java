package forLooping;
import java.util.Scanner;
public class SumOfNNtural {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=8;
		int sum=0;
		for (int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		s.close();
	}
}


