package collectionPrgms;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import methods.PrimebtwRange;

public class PrimeRange {
	public static void main(String[] args) {
		boolean isPrime(int num) {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
		ArrayList<Integer> primeBwRange(int st,int ed) {

			ArrayList<Integer> al=new ArrayList<>();

			for(int i=st;i<=ed;i++) {

				if(isPrime(i)) {

					al.add(i);

				}

			}

			return al;

		}

		public static void main(String[] args) {

			PrimeRange sv=new PrimeRange();

			ArrayList<Integer> a=sv.primeBwRange(10, 20);

			System.out.println(a);

		}
	}
}
