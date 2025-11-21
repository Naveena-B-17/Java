package conArray;
import java.util.Scanner;
public class MarkArr {
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float sum=0f;
		float per=0f;
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		per=sum/(arr.length);
		System.out.println("Total: "+sum);
		System.out.println("Percent: "+per);
	}
}
