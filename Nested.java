package nestedLoop;

public class Nested {
	public static void main(String[] args) {
		int i;
		int j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=2;j++) {
				System.out.print("("+i+","+j+") ");
			}
			System.out.println();
		}
	}
}
