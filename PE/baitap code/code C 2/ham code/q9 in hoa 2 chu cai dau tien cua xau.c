#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main() {
char str[100];
printf("Enter a string with a maximum length of 100 characters: ");
fgets(str, sizeof(str), stdin);
int len = strlen(str);
if (len > 0 && str[len-1] == '\n') {
str[--len] = '\0';
}
for (int i = 0; i < len; i++) {
if (i == 0 || isspace(str[i-1])) {
str[i] = toupper(str[i]);
}
else if (i == 1 || (i > 1 && !isalpha(str[i-2]) && isspace(str[i-1]))) {
str[i] = toupper(str[i]);
}
}
printf("The modified string is: %s\n", str);
return 0;
}
