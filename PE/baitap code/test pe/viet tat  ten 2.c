int main() {
int n;
printf("Enter the size of the array: ");
scanf("%d", &n);
int arr[n];
printf("Enter %d elements of the array:\n", n);
for (int i = 0; i < n; i++) {
scanf("%d", &arr[i]);
}
int result;
printf("Enter the subtraction result: ");
scanf("%d", &result);
for (int i = 0; i < n; i++) {
for (int j = i+1; j < n; j++) {
if (arr[i] - arr[j] == result || arr[j] - arr[i] == result) {
printf("Indices: %d\n%d\n", i, j);
return 0;
}
}
}
printf("No such pair exists.\n");
return 0;
}
