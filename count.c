#include<stdio.h>
#include<conio.h>
void main()
{
    int temp,no,count=0;
    scanf("%d",&no);
    while(no!=0)
    {
        temp=no%10;
        no=no/10;
        count++;
    }
    printf("%d",count);
}
