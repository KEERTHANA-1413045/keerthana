#include<stdio.h>
#include<conio.h>
void main()
{
 char str[55];
 int i,len;
 printf("Enter the string:");
 gets(str);
 for(i=0;str[i]!='\0';i++)
    printf("\n%d",i);
 len=i;
 printf("\nThe length of the string:%d",len);
 getch();
}
