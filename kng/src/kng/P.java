package kng;
import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println(n);
		
		while(n!=0) {
			int temp=n%10;
			System.out.print(temp);
			n=n/10;
			
		}

	}

}
