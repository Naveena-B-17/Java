package conArray;

import java.util.Scanner;

public class ArrUserInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
