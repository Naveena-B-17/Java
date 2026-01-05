package collectionPrgms;
import java.util.LinkedList;
import java.util.Collections;
public class LinkList {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(8);
		ll.add(0);
		ll.add(3);
		ll.add(7);
		ll.addLast(9);
		ll.add(8);
		ll.add(3);
		ll.add(5);
		ll.addFirst(1);
		ll.remove(1);
		ll.remove();
		ll.removeFirst();
		ll.removeLast();
		ll.removeFirstOccurrence(8);
		ll.removeLastOccurrence(3);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.indexOf(7));
		ll.clear();
		System.out.println(ll);
		}
	
}

