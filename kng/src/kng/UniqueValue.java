package kng;
public class UniqueValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ayesha";
		System.out.println("The first non repeating character is ");
		for (int i = 0; i < str.length()-1; i++) {
			boolean flag=true;
			for (int  j =  str.length()-1; j >= 0; j--) {
			if (i!=j&&str.charAt(i)== str.charAt(j)) {
				flag =false;
				break;
				}
			}
			if(flag) {
				System.out.println(str.charAt(i));
				break;
				}
		}

	}

}
