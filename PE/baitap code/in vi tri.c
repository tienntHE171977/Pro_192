#include <stdio.h>
#include <math.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

const int mod = 1e9 + 7;
typedef long long ll;

int main(){
	int a[7], temp=4;

	for(int i = 0;i < 7;i++){
		scanf("%d", &a[i]);
	}
	for(int i = 0;i < 7 - 1;i++){
		for(int j = i + 1;j < 7;j++){
			if(abs(a[i] - a[j]) == temp){
				printf("%d %d\n", i, j);
			}
		}
	}

	return 0;
}