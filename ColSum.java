package array2d;

import java.util.Scanner;

public class ColSum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [][]arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the data: ");
				arr[i][j]=s.nextInt();
		}
		}
		for(int i=0;i<arr[0].length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum+=arr[j][i];
			}
			System.out.println("column"+(i+1)+" "+sum);
		}
	}
}
