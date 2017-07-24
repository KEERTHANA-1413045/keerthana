package Hunters;

import java.util.Scanner;

public class ArraySumIndividual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int x=sc.nextInt();
		int s=0;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			    s=a[i]+a[j];
				if(x==s)
					System.out.println(a[i]+","+a[j]);
			}
		}
		sc.close();
	}

}
