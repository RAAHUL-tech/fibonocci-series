import java.util.Scanner;

public class fibonoccino {

	static int fib,fib1,fib2,n;
	public static void fibonocci(int n)
	{
		fib1=0;
		fib2=1;
		int i=1;
		while(i<=n)
		{
			fib=fib1+fib2;
			fib1=fib2;
			fib2=fib;
			System.out.println(fib);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("The "+a+"fibonocci numbers are: ");
		System.out.println("0 default\n1 default");
		fibonocci(a);
	}

}
