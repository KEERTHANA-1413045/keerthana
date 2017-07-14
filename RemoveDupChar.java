package Players;

import java.util.Scanner;

public class RemoveDupChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c;
		String s=" ";
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			if(c!=' '){
				s=s+c;
				str=str.replace(c, ' ');
			}
		}
		System.out.println(s);
	}

}
