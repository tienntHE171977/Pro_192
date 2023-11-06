#include <stdio.h>
#include <ctype.h>
#include<string.h>
int main() {
    char s[1000];
    int i, n;
    fgets(s, sizeof(s), stdin);
    scanf("%d", &n);
    for (i = 0; i <= n - 1; i++)
    	printf("%c", s[i]);
    printf("\n");
    for (i = n; i <= strlen(s); i++)
    	printf("%c", s[i]);
    return 0;
}
