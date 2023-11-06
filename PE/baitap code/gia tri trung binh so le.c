
#include <stdio.h>
#define MAX_SIZE 100
int main() {
// Declare an array to store the numbers
int numbers[MAX_SIZE];
// Declare a variable to store the number of integers
int n;
// Prompt the user to enter the number of integers
printf("Enter the number of integers: ");
// Read the number of integers from the keyboard (STDIN)
scanf("%d", &n);
// Prompt the user to enter the numbers
printf("Enter %d integers: ", n);
// Read the numbers from the keyboard (STDIN)
int i;
for ( i = 0; i < n; i++) {
scanf("%d", &numbers[i]);
}
// Declare a variable to store the sum of the odd numbers
int sum = 0;
// Declare a variable to store the number of odd numbers
int count = 0;
// Loop through the array of numbers and calculate the sum and count of the odd numbers
for ( i = 0; i < n; i++) {
if (numbers[i] % 2 != 0) {
sum += numbers[i];
count++;
}
}
// Print the average of the odd numbers with one decimal place
printf("Average of the odd numbers: %.1f\n", (float)sum / count);
return 0;
}
