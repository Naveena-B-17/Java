package conArray;
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]= {1,4,2,9,8,3,7};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]){
				int tempp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tempp;
			}
			System.out.println(arr[i]);
			//System.out.println(Arrays.toString(arr));

		}
		
		                                                                                                                                                                                                        
			
		}
	}

