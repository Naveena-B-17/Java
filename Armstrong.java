package whileLoop;
public class Armstrong {
	public static void main(String[] args) {
		for(int num=1;num<=1000;num++) {
		int temp=num;
		int len=0;
		while(num!=0) {
			len++;
			num/=10;
		}
		//System.out.println(len);
		num=temp;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			int pow=1;
			for(int i=1;i<=len;i++) {
				pow=pow*last;
			}
			sum=sum+pow;
			num/=10;
		}
		num=temp;
		}
		if(sum==temp) {
			System.out.println("Armstrong Num");
		}
		else {
			System.out.println("Not an Armstrong");
		}
		
	}
}
