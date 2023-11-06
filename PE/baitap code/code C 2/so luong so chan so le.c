#include <stdio.h>
int main() {
int arr[5];
printf("Enter five integers:\n");
for (int i = 0; i < 5; i++) {
scanf("%d", &arr[i]);
}
int m = 0, n = 0;
for (int i = 0; i < 5; i++) {
if (arr[i] % 2 == 0) {
m++;
} else {
n++;
}
}
printf("Number of even numbers: %d\n", m);
printf("Number of odd numbers: %d\n", n);
return 0;
}
