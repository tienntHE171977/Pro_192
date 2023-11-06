#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  
  int i,j,k,rows;
  scanf("%d",&rows);


  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  


  for(i=1;i<=rows;i++)
  {
  	for(j=1;j<=i;j++)
  	{
  	if((i+j)%2==0)
  	{
  	k=1;
	  }
	  else 
	  {
	k=0;
	  }
	  
	printf("%d ", k);
	  
	  
  }
  printf("\n");
}




  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
