package collectionPrgms;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashPrgm {
	public static void main(String[] args) {
		Set<String>s=new LinkedHashSet<>();
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
		s.remove(1);
		System.out.println(s);
		s.remove(0);
		System.out.println(s);
		s.removeAll(s);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		
	}
}
