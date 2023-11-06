#include <stdio.h>
#include <ctype.h>
#include<string.h>
int ktL(char str[]){
	int n = strlen(str) - 2;
	int i = n / 2 - 1;
	for (;i >= 0; i--){
		if (str[i] != str[n - i])
			return 0;
	}
	return 1;	
}
int ktC(char str[]){
	int n = strlen(str) - 2;
	int i = n / 2;
	for (;i >= 0; i--){
		if (str[i] != str[n - i])
			return 0;
	}
	return 1;	
}
int main() {
    char s[1000];
    int i;
	fgets(s, sizeof(s), stdin);
	if (strlen(s) % 2 == 1){
    	if(ktC(s) == 1)
    		printf("La chuoi doi xung");
    	else 	
    		printf("Khong la chuoi doi xung");
	}
	if (strlen(s) % 2 == 0){
    	if(ktL(s) == 1)
    		printf("La chuoi doi xung");
    	else 	
    		printf("Khong la chuoi doi xung");
	}
	return 0;
}
