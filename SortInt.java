package Players;

import java.util.Arrays;
import java.util.Scanner;

public class SortInt {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=s;
		int i=0;
		String str="";
		while(n%10>0){
			i++;
			n=n/10;
		}
		int[] temp = new int[i];
		for(int j=0;j<temp.length;j++){
			temp[j]=s%10;
			s=s/10;
		}
		Arrays.sort(temp);
		for(i=0;i<temp.length;i++){
		String str1=String.valueOf(temp[i]).toString();
		str+=str1;
		}
		System.out.println(Integer.parseInt(str));
	}

}
