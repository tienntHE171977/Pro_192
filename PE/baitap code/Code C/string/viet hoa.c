#include <stdio.h>
#include <ctype.h>
#include<string.h>
int main() {
    char s[1000];
    int i;
    fgets(s, sizeof(s), stdin);
    for (i = 0; s[i] != '\0'; i++){
    	if(s[i] >= 'a' && s[i] <= 'z')
    		s[i] = s[i] - 32;
	}
//	strupr(s);
    puts(s);
    return 0;
}
