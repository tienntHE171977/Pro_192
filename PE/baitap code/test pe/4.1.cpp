#include <stdio.h>
#include <stdlib.h>
void ShowArray(int a[], int n) //show 1 chuoi
{
int i;
for (i=0;i<n;i++)
{
printf("%d ", a[i]);
}
}
void sapxep(int a[], int n)
{
int i, j;
for (i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if (a[i]>a[j])
{
int tmp;
tmp = a[j];
a[j]=a[i];
a[i]=tmp;
}
}
}
ShowArray(a,n);
}
int main()
{
int a[10];
int i;
for (i=0;i<7;i++)
{
scanf("%d",&a[i]);
}
sapXep(a,n);
system("pause");
return 0;
}
