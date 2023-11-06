#include <stdio.h>
#include <ctype.h>
int main() {
char s[100];
int i;
printf("Enter a string: ");
fgets(s, sizeof(s), stdin);
for ( i = 0; s[i] != '\0'; i++) {
// Capitalize the first letter of each word
if (i == 0 || s[i-1] == ' ') {
s[i] = toupper(s[i]);
s[i+1]=toupper(s[i+1]);
}
}
printf("String after conversion: %s\n", s);
return 0;
}
