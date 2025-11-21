package collectionPrgms;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SortingString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String>arr=new ArrayList<>();
		//to add the elements to the array list
		arr.add("NAME");
		arr.add("CLG");
		arr.add("ROLL NO");
		System.out.println(arr);
		//to update the value within the specific index value
		arr.set(2,"REG");
		System.out.println(arr);
		//to sort the elements in the array
		Collections.sort(arr);
		System.out.println(arr);
		//to print without commas and brackets
		for(String str:arr) {
			System.out.print(str+" ");
		}System.out.println();
		//to search an element in a string
		System.out.println(arr.contains("NAME"));
		//to check whether the arr has elements or empty
		System.out.println(arr.isEmpty());
		//to clear all the elements in the array list
		arr.clear();
		System.out.println(arr);
		
	}
}
