#include <stdio.h>
 #include <stdlib.h>
 int main() {
        int i,j, rows, space=0;
        printf("Enter the number of rows");
        scanf("%d",&rows);
         for (i=rows; i>=1; i--){
             //outer for loop
        for(j=1; j<=space; j++)
                 printf("  ");
                for(j=1; j<=i; j++)
                        printf("%d ",j);
                for (j=i-1; j>=1; j--)
                        printf("%d ",j);
        printf("\n");
     space++;
     }
     getchar ();
     return 0;
}
