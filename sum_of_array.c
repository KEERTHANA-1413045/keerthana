#include<stdio.h>
#include<conio.h>
void main()
{
 int a[10],i,n,sum=0;
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
 printf("a[%d]=",i);
 scanf("%d",&a[i]);
 }
 for(i=0;i<n;i++)
 sum+=a[i];
 printf("the sum of array:%d",sum);
 getch();
}
