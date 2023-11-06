///////ve tam giac tu 1-n vua sao vua so
#include<stdio.h>
int main () {
int n, i, j;  
   printf ("Input n =");
   scanf ("%d",&n);
    for (i = 0; i<n; i ++) {
	     for (j = 0; j <n; j ++) {
		 if (i + j <n) printf("%d", n-i); // ve so 
         if (i + j <n) printf (" * "); // ve sao
		 else printf (" ");
		  } 
		 printf ("\n");
	}
}
