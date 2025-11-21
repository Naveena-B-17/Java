package array2d;

public class ForEachLoop {
	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[]a:arr) {
			for(int num:a) {
				System.out.print(num+" ");
			}
			System.out.println();	
			}
	}
}
