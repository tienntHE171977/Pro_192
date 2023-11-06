#include <stdio.h>
#include <ctype.h>
#include<string.h>
int main() {
    char s[1000];
    int i;
    fgets(s, sizeof(s), stdin);
    strlwr(s);
    s[0] = s[0] - 32;
    for (i = 0; s[i] != '\0'; i++){
    	if(s[i] == ' ')
    		s[i+1] = s[i+1] - 32;
	}
    puts(s);
    return 0;
}
