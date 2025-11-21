package whileLoop;
public class Strong {
public static void main(String[] args) {
	int num=145;
	int temp=num;
	int sum=0;
	while(temp!=0) {
		int last=temp%10;
		int fact=1;
		for(int i=1;i<=last;i++) {
			fact=fact*i;
		}
		//System.out.println(fact);
		sum=sum+fact;
		temp/=10;
	}
	if(num==sum) {
		System.out.println("Strong Num");
	}
	else {
		System.out.println("Not a Strong");
	}
}
}
