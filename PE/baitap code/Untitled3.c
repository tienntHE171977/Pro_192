#include <stdio.h>
#include <stdlib.h>
int main()
{
int a[10];
int i;
for (i=0;i<5;i++)
{
scanf("%d",&a[i]);
}
printf("OUTPUT :\n ");
if(a[0] == a[4] && a [1] == a[3]) printf("1\n");
else printf("0\n");
system("pause");
return 0;
}
