#include<stdio.h>
#include<conio.h>
void main()
{
int m,n,i;
scanf("%d",&m);
scanf("%d",&n);
for(i=m;i<=n;i++)
{
if(i%2==0)
printf("\n%d is even",i);
}
}
