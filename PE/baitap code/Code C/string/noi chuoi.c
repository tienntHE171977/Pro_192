#include<stdio.h>
#include<string.h>
#include<conio.h>
int main(){
	char s1[100];
	char s2[100];
	char s3[200] = "";
	printf("S1: ");
	gets(s1);
	printf("S2: ");
	gets(s2);
	strcat(s3, s1);
	strcat(s3, s2);
	printf("%s", s3);
	return 0;
}

