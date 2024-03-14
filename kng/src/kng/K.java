package kng;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr ="ayesha";
		        boolean flag = true;

		        char[] charArray = inputStr.toCharArray();
				for(char i :charArray)
		        {
		            // if current character is the last occurrence in the string
		            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
		            {
		                System.out.println("First non-repeating character is: "+ i);
		                flag = false;
		                break;
		            }
		        }
		        if(flag)
		            System.out.println("There is no non repeating character in input string");
		    


	}

}
