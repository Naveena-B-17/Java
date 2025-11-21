package methods;

public class boxing {
	public static void main(String[] args) {
		int num=2348;
		String st=String.valueOf(num);
		StringBuffer sb=new StringBuffer();
		sb.append(st);
		System.out.println(sb.reverse());
		Integer nu=Integer.valueOf(num);
		float f=20.25f;
		Float f1=Float.valueOf(f);
		
		
		
		st=sb.toString();
		int res=Integer.parseInt(st);
		//Integer res=Integer.parseInt(st);
		//int op=res.intValue(); 
	}
}
