package rec;
//reverse of a string

import java.util.Scanner;

public class MaxArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the String");
		String s=sc.next();
						
		System.out.println("Enter 1 for non recursive and other number else");
		int choice=sc.nextInt();
		
		if(choice==1)
			System.out.println("Reverse of a string without recursion  "+strrev(s));
		else
			System.out.println("Reverse of a string with recursion  "+strrevrec(s));

	}
	//non recursive
	//aman
	//n+rev(ama)
	//nama
	public static String strrev(String n)
	{
		char[] r=new char[100];
		int len=n.length();
		//4
		int count=0;
		for(int i=len-1;i>=0;i--)
			r[count++]=n.charAt(i);
		String rev=new String(r);
		return rev;
		
	}
	
	
	//recursive
	public static String strrevrec(String n)
	{
		if(n.length()==1)
			return(n);
		else
			return(n.substring(n.length()-1)+strrevrec(n.substring(0, n.length()-1)));
		
		
	}
	

}

