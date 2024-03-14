package kng;
import java.util.Scanner;
import java.util.HashMap;

public class UniqueCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		HashMap<Character,Integer> hp=new HashMap();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(hp.containsKey(ch)){
				hp.put( ch,hp.get(ch)+1);
			}
			else {
				hp.put(ch,1);
			}
	}
		System.out.println(hp);
		
		}
	}

