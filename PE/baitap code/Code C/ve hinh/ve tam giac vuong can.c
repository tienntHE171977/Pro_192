// ve tam giac vuong can
#include <stdio.h>
 
int main() {
   int n,i,j;
   scanf("%d", &n);
   printf("Ve tam giac sao vuong can:\n");
   for(i = 1; i <= n; i++) {
	  for(j = 1; j <= i; j++)
         printf("%c ", i>=j?'*':' ');
 
      printf("\n");
   }
   return 0;
}
