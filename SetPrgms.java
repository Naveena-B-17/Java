package collectionPrgms;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetPrgms {
public static void main(String[] args) {
	   TreeSet<Character>q=new TreeSet<>();
	   q.add('a');
		q.add('h');
		q.add('1');
		q.add('z');
		q.add('w');
		q.addAll(q);
		System.out.println(q);
}
}
