package array2d;

public class RevCol {
	public static void main(String[] args) {
			int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
			for(int i=arr.length-1;i>=0;i--) {
				for(int j=0;j<arr.length;j++){
				if(arr[j]==arr[j]) {
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
