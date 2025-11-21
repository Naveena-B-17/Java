package array2d;

public class MatrixAdd {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{3,4,6},{12,3,4},{6,5,4}};
		for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+arr2[i][j]+"    ");
	}
	System.out.println();
		}
	}
}
