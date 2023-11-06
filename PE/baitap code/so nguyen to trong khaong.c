#include <stdio.h>
#include <math.h>
int nguyento(int n)
{
    int i;
    for (i = 2; i <= (int)sqrt(n); i++)
        if (n % i == 0 && n != i)
        {
            return 1;
            break;
        }
}
int main(void)
{
    int i, kt,a,b;
    scanf ("%d%d",&a, &b);
    
   
    printf("\nCac so nguyen to nho hon n la: ");
    int count=0;
    int ar[100];
    for (i = a; i <=b; i++)              
        {
        	if (nguyento(i) != 1)
        	{		
        	           ar[count]=i;
        	            count++;    
			}				
}


for (i=0;i<=count-1;i++)
{
	if (i>=count-2)
	printf("%d  ",ar[i]);
}
    return 0;
}
