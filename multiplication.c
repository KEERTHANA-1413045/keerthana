#include<stdio.h>
#include<conio.h>
void main()
{
 int n,i,a,j;
 scanf("%d",&n);
 scanf("%d",&j);
 for(i=1;i<=j;i++)
 {
  a=i*n;
  printf("\n%d*%d=%d",i,n,a);
 }
}
