package Players;

import java.util.Scanner;

public class StrNoMul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		int n=Integer.parseInt(s);
		int n1=Integer.parseInt(s1);
		int mul=n1*n;
		System.out.println(String.valueOf(mul));
		sc.close();
	}

}
