package collectionPrgms;
import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;
public class StackPrgm {
	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		s.push(7);
		s.push(0);
		s.push(2);
		s.push(4);
		s.push(1);
		s.push(3);
		System.out.println(s);
		//removes the top element
		s.pop();
		System.out.println(s);
		//displays the top element
		System.out.println(s.peek());
		System.out.println(s);
		//removes the 1st element
		s.remove(1);
		System.out.println(s);
		s.removeFirst();
		System.out.println(s);
		s.removeLast();
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.size());
		s.add(10);
		System.out.println(s);
		System.out.println(s.capacity());
		s.clear();
		System.out.println(s);
	}
}
