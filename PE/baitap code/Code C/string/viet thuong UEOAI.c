#include <stdio.h>
#include <ctype.h>
#include<string.h>
int main() {
    char s[1000];
    int i;
    fgets(s, sizeof(s), stdin);
    strupr(s);
	for (i = 0; s[i] != '\0'; i++){
    	if (s[i] == 'U' || s[i] == 'E' || s[i] == 'O' || s[i] == 'A' || s[i] == 'I')
    		s[i] = s[i] + 32;
	}
    puts(s);
    return 0;
}
