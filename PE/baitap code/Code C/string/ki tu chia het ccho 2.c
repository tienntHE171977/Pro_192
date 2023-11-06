#include <stdio.h>
#include <ctype.h>
#include<string.h>
int main() {
    char s[1000];
    int i, d = 0;
    fgets(s, sizeof(s), stdin);
    for (i = 0; s[i] != '\0'; i++){
    	if(s[i] >= '1' && s[i] <='9' && s[i] % 2 == 0)
    		d++;
	}
    printf("%d", d);
    return 0;
}
