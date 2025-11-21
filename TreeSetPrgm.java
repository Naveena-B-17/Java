package collectionPrgms;
import java.util.TreeSet;
import java.util.Set;
public class TreeSetPrgm {
	public static void main(String[] args) {
		Set<String>s=new TreeSet<>();
		s.add("A");
		s.add("D");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("D");
		System.out.println(s.size());
		System.out.println(s.contains("D"));
		System.out.println(s.isEmpty());
		s.remove("A");
		System.out.println(s);
		s.remove("z");
		System.out.println(s);
		s.removeAll(s);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		
	}
}
