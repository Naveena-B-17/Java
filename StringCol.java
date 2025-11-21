package collectionPrgms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class StringCol {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter arr size: ");
		int n=s.nextInt();
		s.nextLine();
		ArrayList<String>arr=new ArrayList();
		
		for(int i=0;i<=n;i++) {
			System.out.println("enter strings: ");
			
			String str=s.nextLine();
			arr.add(str);
		}
		System.out.println(arr);
		
	}
}