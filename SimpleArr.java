package conArray;

public class SimpleArr {
	public static void main(String[] args) {
		String arr[]={"n1","n2","n3","n4"};
		arr[3]="nn";
		System.out.println(arr[0]);//accessing the data
		System.out.println(arr);//array 
		System.out.println(arr.length);//length of array
		System.out.println(arr[arr.length-1]);//Accessing last element
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
	
}
