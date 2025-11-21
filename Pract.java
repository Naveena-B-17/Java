package collectionPrgms;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;
public class Pract {
	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<>();
		HashMap<Character,Integer>b=new HashMap<>();
        String s="vvvelalar";
        for(char c:s.toCharArray()) {
        if(b.containsKey(c)) {
        	b.put(c,b.get(c)+1);
        }
        else {
        	b.put(c, 1);
        }
        }System.out.println(b);
        LinkedHashMap<Character,Integer>op=new LinkedHashMap<>();
         
        for(Map.Entry<Character,Integer>it:op.entrySet()) {
        
        }
	}
}
