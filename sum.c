#include<stdio.h>
#include<conio.h>
void main()
{
 int n,sum=0,i;
 scanf("%d",&n);
 for(i=1;i<n;i++)
 {
 printf("%d",i);
 sum+=i;
 }
 printf("\nsum is%d",sum);
 getch();
}
