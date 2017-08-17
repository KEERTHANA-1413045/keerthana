package Players;

import java.util.Scanner;

public class SwapEvenOddChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=0;i<str.length();i++){
			if(i<str.length()-1){
			if(i%2==0){
				s+=Character.toString(str.charAt(i+1))+Character.toString(str.charAt(i));
			}
			}
			if(i==str.length()-1){
				if(i%2==0)
				s+=Character.toString(str.charAt(i));
			}
		}
			System.out.println(s);
			sc.close();
	}

}
