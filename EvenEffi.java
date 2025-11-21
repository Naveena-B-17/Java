package forLooping;

public class EvenEffi {
	public static void main(String[] args) {
		int i=2;
		if(i%2!=0) {
			i++;
		}
		for(;i>=10;i+=2) {
			System.out.println(i);
		}
	}
}
