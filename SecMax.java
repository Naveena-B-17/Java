package conArray;

public class SecMax {
	public static void main(String[] args) {
		int[]arr= {99,10,100,20,30,7,40,50,9,90};
		int max=0;
		int min=0;
		if (arr[0]<arr[1]) {
			max=arr[1];
			min=arr[0];
		} 
		else {
			max=arr[0];
			min=arr[1];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max) {
				int temp=max;
				max=arr[i];
				min=temp;
			}
			else if(arr[i]>min&&arr[i]!=max) {
				min=arr[i];
			}
		}
		System.out.println(max+" first large");
		System.out.println(min+" second large");
	}
}
