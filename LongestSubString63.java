package Pro;

import java.util.Scanner;

public class LongestSubString63 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				str1+=str.charAt(i);
				str=str.replace(str.charAt(i),' ');
			}
		}
		System.out.println(str1);
		sc.close();
	}

}
