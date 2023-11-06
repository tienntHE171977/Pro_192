#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>
int main() {
system("cls");
//INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
int numbers[5];
int i, sum = 0;
// Read in numbers
for (i = 0; i < 5; i++) {
scanf("%d", &numbers[i]);
}
// Compute sum of numbers divisible by 3 and not by 5
for (i = 0; i < 5; i++) {
if (numbers[i] % 3 == 0 && numbers[i] % 5 != 0) {
sum += numbers[i];
}
}
// Fixed Do not edit anything here.
printf("\nOUTPUT:\n");
//@STUDENT: WRITE YOUR OUTPUT HERE:
printf("%d", sum);
//--FIXED PART - DO NOT EDIT ANY THINGS HERE
printf("\n");
system ("pause");
return(0);
}
