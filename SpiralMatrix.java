package Players;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[4][4];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
