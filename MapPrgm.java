package collectionPrgms;
import  java.util.Map;
import java.util.Set;
import  java.util.HashMap;
import java.util.LinkedHashSet;
public class MapPrgm {
	public static void main(String[] args) {
		Map<Integer,String>s=new HashMap<>();
			s.put(1,"A");
			s.put(2,"D");
			s.put(3,"B");
			s.put(4,"C");
			s.put(5,"D");
			s.put(6,"E");
			s.put(7,"D");
			System.out.println(s.size());
			System.out.println(s.get(2));
			System.out.println(s.containsKey(1));
			System.out.println(s.containsValue("D"));
			System.out.println(s.isEmpty());
			s.remove(1);
			System.out.println(s);
			s.remove(0);
			System.out.println(s);
			s.clear();
			System.out.println(s);
	}
}
