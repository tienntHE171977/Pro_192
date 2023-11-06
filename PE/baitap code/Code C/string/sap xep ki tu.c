#include <stdio.h>
#include <ctype.h>
#include<string.h>
int main() {
	char c;
    char a[1000];
    int i, n;
    fgets(s, sizeof(s), stdin);
    for (i = 0; s[i] != '\0'; i++){
    	if(s[i] == ' ')
    		s[i] = '*';
	}
    puts(s);
    return 0;
}
