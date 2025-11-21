package conArray;

public class Doubt {
	public static void main(String[] args) {
		int rev=0;
		int last=0;
		int i=1006;
		for(;i!=0;i/=10) {
			last=i%10;
			rev=(rev*10)+last;
		}
		System.out.println(rev);
		while(i!=0) {
			last=i%10;
			rev=(rev*10)+last;
			i++;
		}
		System.out.println(rev);
		
	}
}
