#include <stdio.h>
#include <ctype.h>
int main() {
    int i, thuong, hoa = 0, so = 0, dacbiet = 0;
    char s[1000];
    fgets(s, sizeof(s), stdin);
    for (i =0; s[i] != '\0'; i++){
    	if (s[i] >= 'a' && s[i] <= 'z')
    		thuong++;
    	else if (s[i] >= 'A' && s[i] <= 'Z')
    		hoa++;
    	else if (s[i] >= '0' && s[i] <= '9')
    		so++;
    	else 
    		dacbiet++;
    		
	}
    printf("So ki tu thuong la: %d \n", thuong - 1);
    printf("So ki tu hoa la: %d \n", hoa);
    printf("So ki tu so la: %d \n", so);
    printf("So ki tu dac biet la: %d \n", dacbiet - 1);
    return 0;
}
