package forLooping;

public class Facts {
	public static void main(String[] args) {
		int n=15;
		int i;
		for(i=1;i<=15;i++) {
			if(n%i==0) {
				System.out.println(i);	
			}
		}
	}
}