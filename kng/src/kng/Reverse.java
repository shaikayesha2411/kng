package kng;

public class Reverse {
	public static void main(String args[]) {
		String str="ayesha";
		String f="";
		char ch;
		System.out.println(str.charAt(0));
		for(int i=str.length()-1;i>=0;i--) {
			ch=str.charAt(i);
			f+=ch;
		}
		System.out.println(f);
	}

}
