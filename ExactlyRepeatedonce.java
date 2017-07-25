package Hunters;

public class ExactlyRepeatedonce {

	public static void main(String[] args) {
		int a[]={1,2,6,9,9,1,3,6,2};
		int[] count=new int[a.length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]&&i!=j){
					count[i]++;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			//System.out.print(count[i]+"--"+a[i]);
			//System.out.println();
			if(count[i]==0){
				System.out.println(a[i]);
			}
		}
	}

}