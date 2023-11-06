#include <stdio.h>

int countDuplicates(int arr[], int n){
    int i, j, count = 0;
    for (i = 0; i < n; i++){
        for (j = i+1; j < n; j++){
            if (arr[i] == arr[j]){
                count++;
                break;
            }
        }
    }
    return count;
}

int main(){
    int arr[] = {1, 2, 3, 4, 5, 3, 6, 7, 8, 9, 10, 11, 11};
    int n = sizeof(arr)/sizeof(arr[0]);
    printf("Tong so phan tu trung lap la: %d", countDuplicates(arr, n));
    return 0;
}
