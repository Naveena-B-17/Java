package array2d;
import java.util.Arrays;
import java.util.Scanner;
public class PrintEvenElements {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [][]arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the data: ");
				arr[i][j]=s.nextInt();
		}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (arr[i][j]%2==0) {
				System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
