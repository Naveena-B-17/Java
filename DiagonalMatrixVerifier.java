package array2d;

public class DiagonalMatrixVerifier {
	public static void main(String[] args) {
		int arr[][]= {{1,0,0},{0,1,0},{0,0,1}};
		boolean b=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j)
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}     
}
