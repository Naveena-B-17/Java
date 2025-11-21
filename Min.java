package forLooping;

public class Min {
	public static void main(String[] args) {
		int i=74657;
		int min;
		min=i%10;
		for(;i!=0;i/=10) {
			int last=i%10;
			if(min>last) {
			min=last;
			}
		}
			System.out.println(min);
	}
}
