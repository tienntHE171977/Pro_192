#include <stdio.h>

int main() {
    int arr[] = {1, 3, 3, 2, 2, 5, 6, 7, 8, 9};
    int len = sizeof(arr) / sizeof(int);
    int i, j;

    printf("Cac vi tri lap nhau trong mang la: ");
    for (i = 0; i < len; i++) {
        for (j = i + 1; j < len; j++) {
            if (arr[i] == arr[j]) {
                printf("%d ", arr[i]);
                break;
            }
        }
    }

    return 0;
}

