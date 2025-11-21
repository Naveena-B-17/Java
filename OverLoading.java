package methodOverloading;

public class OverLoading {
	void sum(int n1,int n2) {
		System.out.println(n1 +n2);
	}
	void sum(int n1,float n2) {
		System.out.println(n1 +n2);
	}
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.sum(2, 05);
		o.sum(2, 5.0f);
	}
}
