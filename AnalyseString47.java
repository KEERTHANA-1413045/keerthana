package Hunters;

public class AnalyseString47 {

	public static void main(String[] args) {
		String str="my brother is taller than me@1233334. I always a short man,but smart than him";
		String str1="";
		String[] str2=str.split(" ");
		for(int i=0;i<str2.length;i++){
				str1+=str2[i];
		}
		String str3="";
		int count=0,count1=0,count2=1;
		System.out.println("Remove space: "+str1);
		for(int i=0;i<str2.length-1;i++){
				if(str2[i].length()>str2[i+1].length()){
					String temp=str2[i];
					str2[i]=str2[i+1];
					str2[i+1]=temp;
					str3=str2[i+1];
				}
		}
		System.out.println("Longest Word: "+str3);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='e'){
				count++;
			}
			if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				count1++;
			}
			if(str.charAt(i)=='.'){
				count2++;
			}
		}
			System.out.println("Number of 'e': "+count);
			System.out.println("Number of integer: "+count1);
			System.out.println("Number of words: "+str2.length);
			System.out.println("Number of words: "+count2);
	}

}
