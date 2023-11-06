#include <stdio.h>
int main() {
// Declare a variable to store the number of rows
int rows;
// Prompt the user to enter the number of rows
printf("Enter the number of rows (row > 0): ");
// Read the number of rows from the keyboard (STDIN)
scanf("%d", &rows);
// Loop through the rows and print the palindrome triangle pattern
for (int i = 0; i < rows; i++) {
// Print the characters of the current row
for (int j = 0; j <= i; j++) {
printf("%c", 'A' + j);
}
for (int j = i - 1; j >= 0; j--) {
printf("%c", 'A' + j);
}
printf("\n");
}
return 0;
}