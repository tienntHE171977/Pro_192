#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  float score;
scanf("%f", &score);





  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  if (score >= 5.0 && score <= 10.0) {
printf("Passed with the score: %.1f\n", score);
} else if (score >= 0.0 && score < 5.0) {
printf("Failed with the score: %.1f\n", score);
} else {
printf("Invalid score entered\n");
}











  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
