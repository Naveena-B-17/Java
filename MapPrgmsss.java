package collectionPrgms;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class MapPrgmsss {
	public static void main(String[] args) {
		LinkedHashMap<Character,Integer>q=new LinkedHashMap<>();
		 	q.put('a',1);
			q.put('h',2);
			q.put('1',2);
			q.put('z',1);
			q.put('w',5);
			Iterator <Character>it=q.keySet().iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			for(Character c:q.keySet()) {
				System.out.println(c+" : "+q.get(c));
			}
			for(Integer i:q.values()) {
				System.out.println(i);
			}
			System.out.println("BY USING MAP CONCEPT");
			for(Map.Entry<Character,Integer>itt:q.entrySet()) {
				System.out.println(itt.getKey()+" : "+itt.getValue());
			}
	}
}