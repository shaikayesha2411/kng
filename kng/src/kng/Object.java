package kng;

import java.util.Objects;

class pubg{
	int m;
	String m1;
	public String toString() {
		return "hey";
	}
	@Override
	public int hashCode() {
		return Objects.hash(m, m1);
	}
	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pubg other = (pubg) obj;
		return m == other.m && Objects.equals(m1, other.m1);
	}
}
public class Object  {

	public static void main(String[] args) {
		
		pubg oj=new pubg();
		pubg oi=new pubg();
		oj.m=99;
		oj.m1="aye";
		oi.m=99;
		oi.m1="aye";
		System.out.println(oj);
		if(oi==oj)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		if(oi.equals(oj)) {
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
		System.out.println(oj.equals(oi));
		
		// TODO Auto-generated method stub

	}

}

