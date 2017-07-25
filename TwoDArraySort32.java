package Pro;

import java.util.Scanner;

public class TwoDArraySort32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int temp;
		int[][] a=new int[n][n1];
		for(int i=0;i<n;i++){
			for(int j=0;j<n1;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n1;j++){
				for(int k=0;k<n;k++){
					if(a[i][j]<a[k][j]){
					temp=a[i][j];
					a[i][j]=a[k][j];
					a[k][j]=temp;
				}
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n1;j++){
				for(int k=0;k<n1;k++){
					if(a[i][j]<a[i][k]){
					temp=a[i][j];
					a[i][j]=a[i][k];
					a[i][k]=temp;
				}
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n1;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
