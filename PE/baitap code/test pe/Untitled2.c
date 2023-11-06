#include <stdio.h>
int main () {
	int n,i;
	scanf ("%d", &n);
	long sum=0;
	int count=0;
	for (i=n; i>0; i--) {
		if(i%2==0) {
		
		sum+=i;
		count ++;
	}
		if(count==3) {
			break;
		}
	}
	printf ("%ld", sum);
}