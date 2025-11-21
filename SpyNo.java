package forLooping;

public class SpyNo {
	public static void main(String[] args) {
		/*123=1+2+3=6
		  123=1*2*3=6
		 */
		//for two digit
		/*int x=22;
		int sum=0;
		int mul=1;
		int first=x/10;
		int last=x%10;
		sum=first+last;
		mul=first*last;
		*/
		int x=123;
		int tem=x;
		int sum=0;
		int mul=1;
		while(x!=0) {
			int last=x%10;
			sum=sum+last;
			x=x/10;
		}
		System.out.println(sum);
		x=tem;
		while(x!=0) {
			int last=x%10;
			mul=(mul*last);
			x=x/10;
		}
		System.out.println(mul);
		if (sum==mul) {
			System.out.println("Spy Num");
		}
		else {
			System.out.println("Not a Spy Num");
		}
		
	}
}
