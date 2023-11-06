#include <stdio.h>
int main() {
int n;
printf("Enter the size of the array: ");
scanf("%d", &n);
int arr[n];
printf("Enter %d elements of the array:\n", n);
int i;
for ( i = 0; i < n; i++) {
scanf("%d", &arr[i]);
}
int smallest_odd_index = -1, largest_odd_index = -1;
int smallest_odd = 99999999, largest_odd = -99999999;
// Find the index of the first smallest and largest even numbers
for ( i = 0; i < n; i++) {
if (arr[i] % 2 ==1) {
if (arr[i] < smallest_odd) {
smallest_odd = arr[i];
smallest_odd_index = i;
}
if (arr[i] > largest_odd) {
largest_odd = arr[i];
largest_odd_index = i;
}
}
}
// Swap the positions of the smallest and largest even numbers
if (smallest_odd_index != -1 && largest_odd_index != -1) {
int temp = arr[smallest_odd_index];
arr[smallest_odd_index] = arr[largest_odd_index];
arr[largest_odd_index] = temp;
}
// Print the updated array
printf("Updated array: ");
for ( i = 0; i < n; i++) {
printf("%d ", arr[i]);
}
printf("\n");
return 0;
}
