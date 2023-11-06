#include <stdio.h>
#include <string.h>
	int isletter(char c) {
		c=tolower(c);
		if(c>='a'&& c<='z')
		return 1;
		return 0;
	}
	int isDigit(char c) {
		if (c>='0' && c<='9')
		return 1;
		return 0;
	}
	int isSpecialChar(char c) {
		if(isDigit(c)==0 && isletter(c)==0)
		return 1;
		return 0;
	}
int main () {
	char s[32];
	gets(s);
	int count1=0, count2=0, count3=0,i;
	for(i=0;i < strlen(s); i++) {
		if(isletter(s[i])) {
			count1++;
		}
	}
	printf("%d",count1);
	
}