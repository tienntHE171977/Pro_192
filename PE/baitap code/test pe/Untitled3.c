#include <stdio.h>
#include <string.h>

int main()
{
    char chars[4];
    int i, j;
    char temp;
    for(i=0; i<4; i++)
    {
        scanf("%c\n", &chars[i]); 
    }

    for(i=0; i<3; i++)
    {
        for(j=i+1; j<4; j++)
        {
            if(chars[i] > chars[j])
            {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }
    }

    for(i=0; i<4; i++)
    {
        printf("%c ", chars[i]);
    }
   

    return 0;
}
