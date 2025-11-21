package methods;
//https://github.com/Manoj-Deivasigamani/JavaProgramming		TO TAKE A PIC TO GIT

/*

git add .

# Commit with a message

git commit -m "Added new Java files"

# Push to your remote repo (usually 'origin' and branch 'main' or 'master')

git push origin main*/



public class TypesOfBoxing {
	public static void main(String[] args) {
		//auto boxing prim to non prim
		int num=34258;
		Integer nu=Integer.valueOf(num);
		Integer n=num;
		//unboxing non-prim
		Integer no=2547;
		int op=no.intValue();
		int o=no;
		//non primitive to non primitive
		//integer to string 
		Integer no1=234;
		String st1=String.valueOf(no1);
		//str to int
		String st="8347";
		Integer res=Integer.parseInt(st);
		System.out.println(n);
	}
}
