package collectionPrgms;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
public class QueueTyp {
public static void main(String[] args) {
	Queue<Integer>q=new ArrayDeque<>();
	Deque<Integer>q1=new LinkedList<>();
	Deque<Integer>q2=new ArrayDeque<>();
	Queue<Integer>q3=new LinkedList<>();
	q.offer(5);
	q.offer(1);
	q.offer(3);
	q.offer(4);
	q.offer(2);
	q.offer(0);
	System.out.println(q);
	/*q.offerFirst(9);
	q.pollFirst();*/   //Only allowed for the dequeue interference
	q1.offer(5);
	q1.offer(1);
	q1.offer(3);
	q1.offer(4);
	System.out.println(q1);
	q2.offer(5);
	q2.offer(1);
	q2.offer(3);
	q2.offer(4);
	q2.pollFirst();
	q2.offerFirst(2);
	System.out.println(q2);
	q3.offer(5);
	q3.offer(1);
	q3.offer(3);
	q3.offer(4);
	//q3.offerFirst(2); IT WILL NOT SUPPORT FOR THE QUEUE INTERFERENCE OF THE LINKEDLIST PARENT CLASS
	System.out.println(q3);
}
}
