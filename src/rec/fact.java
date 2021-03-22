package rec;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number");
		int num=sc.nextInt();
		System.out.print(factorial(num));

	}
	public static long factorial(int x)
	{
		if(x==1)
			return 1;
		else
			return(x*factorial(x-1));
	}

}
