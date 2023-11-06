#include <stdio.h>
#include <string.h>
int main () {
	char s[200];
	gets(s);
	int len =strlen(s);
	int i;
	for (i=0; i < len ; i++) {
		
		toupper(s[0]),toupper(s[1]);
	if (i==0 || (i>0 && s[i-1]==32)) {
		
		if(s[i]>=97 && s[i] <=122) 
		s[i]=s[i]-32;
		s[i+1]=s[i+1]-32;
	}
	else {
		if(s[i]>=65 && s[i]<=90)
		s[i]+=32;
	}
	printf("%c", s[i]);
	}
	
}
