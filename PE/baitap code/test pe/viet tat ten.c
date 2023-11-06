 #include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  char s[300];
  scanf("%[^\n]%*c", s);
  int last = strlen(s) - 1;
  while (s[last] != ' ') last--;
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  printf("%c", s[0]);
  int i;
  for (i = 1; i < last; i++) {
   if (s[i] == ' ' && s[i+1] != ' ') printf("%c", s[i+1]);
  }
  for (i = last + 1; i < strlen(s); i++) printf("%c", s[i]);
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
