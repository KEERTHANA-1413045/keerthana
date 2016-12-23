#include<stdio.h>
#include<conio.h>
void main()
{
    char str[10],i=0,j;
    gets(str);
    for(j=1;j<=5;j++)
    {
 for(i=0;str[i]!='\0';i++)
 {
     printf("%c",str[i]);
 }
 printf("\n");
    }
 getch();
}
