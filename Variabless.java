package basics;
public class Variabless {

	String name;

	static String clg;

	void disp() {

		System.out.println(name+" "+clg);

	}

	public static void main(String[] args) {

		Variabless s1=new Variabless();

		Variabless s2=new Variabless();

		s1.name="Kabilan";

		clg="Vcet";

		s2.name="Harish";

		s1.disp();

		s2.disp();

	}
}