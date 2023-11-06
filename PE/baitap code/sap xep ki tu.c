#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare(const void *a, const void *b)
{
    return strcmp((const char *) a, (const char *) b);
}

int main()
{
    char s[4];
   gets(s);
    int n = sizeof(s) / sizeof(s[0]);

    qsort(s, n, sizeof(char), compare);

    printf("Mang sau khi sap xep: \n");
    for(int i = 0; i < n; i++)
    {
        printf("%c ", s[i]);
    }

    return 0;
}