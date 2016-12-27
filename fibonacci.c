#include<stdio.h>
#include<conio.h>
void main()
{
 int k,i=0,j=1,num,n;
 scanf("%d",&num);
 printf("Enter the range:%d",num);
 for(k=1;k<=num;k++)
 {
     printf("\n%d",j);
 n=i+j;
 i=j;
 j=n;
}
}
