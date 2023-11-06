#include <stdio.h>
int main () {
	int N1[2][3],N2[2][3],Ms[2][3],i,j;
	for (i=0;i <2;i++) {
		for (j=0;j<3;j++) {
			scanf ("%d", &N1[i][j]);
		}
	}
	for (i=0;i <2;i++) {
		for (j=0;j<3;j++) {
			scanf ("%d", &N2[i][j]);
		}
	}
	for (i=0; i <2;i++) {
		for (j=0;j <3; j++) {
			Ms[i][j]=N1[i][j]+N2[i][j];
		}
	}
	for (i=0; i <2;i++) {
		for (j=0;j <3; j++) {
			printf("%d ", Ms[i][j]);
		} printf("\n");
	}
	getchar();
	return (0);
}