
package kng;
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		while(n!=0)
		{
			int c;
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			n--;
		}
		

	}

}
