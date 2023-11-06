#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	char c[4];
	int i, j;

	for (i = 0; i < 4; i++){
		scanf("%c", &c[i]);
		getchar();
	}
	for (i = 0; i < 4 - 1; i++){
		for (j = i + 1; j < 4; j++){
			if (c[i] > c[j]){
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
			}
		}
	}






  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:

	for (i = 0; i < 4; i++){
		printf("%c ",c[i]);
	}




  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
