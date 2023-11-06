#include <stdio.h>
#include <string.h> 
int main ( ) {
	char s[100];
	gets(s);
	int len =strlen (s);
	int i;
	for (i=0; i < len; i++) {
		if(s[i]>='a' && s[i] <= 'z' || s[i]>='A' && s[i]<='Z') {
			printf("%c", s[i]);
		}
	}
}
