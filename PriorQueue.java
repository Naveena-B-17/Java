package collectionPrgms;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
public class PriorQueue {
public static void main(String[] args) {
	PriorityQueue<Character> pq=new PriorityQueue<>();
	Queue<Character> q=new PriorityQueue<>((a,b)->b-a);
	q.add('a');
	q.add('h');
	q.add('1');
	q.add('z');
	q.add('w');
	pq.addAll(q);
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(pq);
	System.out.println(pq.poll());

	
}
}
