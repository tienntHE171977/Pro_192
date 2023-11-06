#include<stdio.h>
int main ()
{
int n;
scanf("%d", &n);
int i,j;
int a[1000];
for(i=0;i<n;i++)
{
scanf("%d", &a[i]);
}
int dev;
int count=0;
scanf("%d", &dev);
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]-a[j]==dev)
{
count++;
printf("%d\n%d",i,j);
}
if(count==1)
{
break;
}
}
}
}
