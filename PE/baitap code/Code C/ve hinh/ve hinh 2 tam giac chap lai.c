///////ve hinh 2 tam giac chap lai
#include<stdio.h>
main(){
	int n, i, j;
	printf("n= ");
	scanf("%d", &n);
	for (i=1;i<=n;i++){ //ve tam giac can xuoi
		for (j=1;j<=n-i;j++) 
			printf(" .");
		for (j=1;j<=2*i-1;j++)
			printf("* ");
		printf("\n");
	}
//	for (i=2;i<=n;i++){  //ve tam giac can nguoc
//		for (j=1;j<=i-1;j++) printf("  ");
//		for (j=i;j<=2*n-i;j++)
//		printf("* ");
//		printf("\n");
//	}
}
