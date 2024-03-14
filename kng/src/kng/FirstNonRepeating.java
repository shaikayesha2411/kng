package kng;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ayesha";
		boolean flag=true;
		char ch=str.charAt(0)
		
		for(int i=0;i<str.length();i++) {
		if(str.indexOf(i)==str.lastIndexOf(i)) {
			flag=false;
			break;
		}
			
		}
		if(flag==false) {
		System.out.println(ch);
		}
	}
}


