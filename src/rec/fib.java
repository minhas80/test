package rec;

import java.util.Scanner;

// nth fibonacci number
public class fib {
//1 1 2 3 5 8 13...
	
	//n=3--->1+1
	//n=4---->2+1=3
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Which fibonacci number to be displayed");
		int num=sc.nextInt();
		System.out.print(fibonacci(num));

	}
public static int fibonacci(int n)
{
	if(n==1 || n==2)
		return 1;
	else
		return(fibonacci(n-1)+fibonacci(n-2));
}
}



