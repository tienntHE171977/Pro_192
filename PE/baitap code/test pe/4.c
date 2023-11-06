#include <stdio.h>
void show(int arr[], int n) {
	int i;
	for (i=0; i <n; i++) {
		printf("%d ", arr[i]);
}}

int main () {
	int arr[10];
	int i;
	for (i=0; i < 7; i++) {
		scanf ("%d\n", &arr );
	}
	int min,j;
	int temp;
	for (i= 0;i < 7-1;i++){
		min = i;
		for ( j = i+1;j<7;j++)
			if (arr[j] < arr[min] )
				min = j;
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;	
	}
	
	for (i=0;i<7;i++)
	printf ("%d ",arr[i]); 
	getchar();
	return (0);
}
