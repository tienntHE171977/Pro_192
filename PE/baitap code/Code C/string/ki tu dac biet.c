#include <stdio.h>
#include <ctype.h>
int main() {
    char str[100];
    int i;
    printf("Nhap vao mot chuoi: ");
    gets(str);
    printf("Cac ki tu dac biet trong chuoi la: ");
    for (i = 0; str[i] != '\0'; i++) {
        if (!isalnum(str[i]) && !isspace(str[i])) {
            printf("%c ", str[i]);
        }
    }
    return 0;
}

