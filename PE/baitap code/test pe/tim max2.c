#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  int n;
  scanf("%d", &n);
  int i, a[n];
  int max = -1;
  for (i = 0; i < n; i++) {
 scanf("%d", &a[i]);
 if (a[i] > max) max = a[i];
  }
  
  int max2 = -1;
  for (i = 0; i < n; i++) {
   if (a[i] > max2 && a[i] < max) max2 = a[i];
  }
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  printf("%d", max2);

  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
