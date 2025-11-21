package forLooping;

public class Max {
	public static void main(String[] args) {
		int i=96;
		int max;
		max=i%10;
		for(;i!=0;i=i/10) {
			int last=i%10;
			if(max<last) {
			max=last;
		}
			
	}
		System.out.println(max);
		//System.out.println(i);
	}
}
