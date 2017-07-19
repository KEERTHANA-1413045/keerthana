package Players;

import java.util.Scanner;

public class RemDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c!=' '){
				str1=str1+c;
				str=str.replace(c, ' ');
			}
		}
		System.out.println(str1);
		sc.close();
	}

}
