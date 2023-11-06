#include <stdio.h>

#define MAX_SIZE 100 // Ð?nh nghia kích thu?c t?i da c?a m?ng

void demTanSuat(int arr[], int size) {
    int i, j, dem;
    int tanSuat[MAX_SIZE]; // M?ng luu tr? t?n su?t xu?t hi?n c?a m?i ph?n t? trong m?ng

    for (i = 0; i < size; i++) {
        dem = 1; // Kh?i t?o s? l?n xu?t hi?n c?a ph?n t? d?u tiên là 1
        for (j = i + 1; j < size; j++) {
            if (arr[i] == arr[j]) { // N?u phát hi?n ph?n t? gi?ng nhau
                dem++; // Tang bi?n d?m lên 1
                tanSuat[j] = 0; // Ðánh d?u ph?n t? này dã du?c d?m
            }
        }
        if (tanSuat[i] != 0) { // N?u chua d?m ph?n t? này
            tanSuat[i] = dem; // Luu s? l?n xu?t hi?n vào m?ng t?n su?t
        }
    }

    // In ra k?t qu?
    printf("\nT?n su?t xu?t hi?n c?a các ph?n t? trong m?ng la:\n");
    for (i = 0; i < size; i++) {
        if (tanSuat[i] != 0) { // N?u ph?n t? chua du?c d?m
            printf("%d-%d ", arr[i], tanSuat[i]);
        }
    }
}

int main() {
    int arr[MAX_SIZE];
    int size, i;

    printf("Nhap so luong phan tu cua mang: ");
    scanf("%d", &size);

    printf("Nhap cac phan tu cua mang:\n");
    for (i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    demTanSuat(arr, size);

    return 0;
}
