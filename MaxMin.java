package conArray;

public class MaxMin {
	public static void main(String[] args) {
		int[]arr= {70,40,30,60,9};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		
	}
}
