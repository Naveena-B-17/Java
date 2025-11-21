package array2d;
import java.util.Arrays;
import java.util.Scanner;
public class InputFor2dArr {
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
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
