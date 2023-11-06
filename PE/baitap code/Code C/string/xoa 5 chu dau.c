#include <stdio.h>
#include <ctype.h>
#include<string.h>
int main() {
    char s[1000];
    int i;
    fgets(s, sizeof(s), stdin);
    for (i = 0; i <= 4; i++){
    		s[i] = ' ';
	}
    puts(s);
    return 0;
}
