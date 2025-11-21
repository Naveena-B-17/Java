package mutableString;

public class Bufferex {
	public static void main(String[] args) {
		String s="Navi";
		System.out.println(s.concat(" navee")+(" b"));
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(s);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" is studying.");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(s);
	}
}
