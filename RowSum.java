package array2d;

public class RowSum {
	public static void main(String[] args) {
		int sum=0;
		int arr[][]= {{2,4,6},{1,3,5},{6,8,1}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			System.out.println(sum);
			sum=0;
		}
	}
}
