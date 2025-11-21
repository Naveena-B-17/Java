package basics;

public class Staticvariables {

		int num=1;  //instance

		static int num1=1;  //static refers unique memory for entire class

		void disp() {

			num1++;

			num++;

			System.out.println("Ins " +num);

			System.out.println("Static "+num1);

		}

		public static void main(String[] args) {

			Staticvariables s1=new Staticvariables();

			Staticvariables s2=new Staticvariables();

			Staticvariables s3=new Staticvariables();

			s1.disp();

			s2.disp();

			s3.disp();

		}


}
