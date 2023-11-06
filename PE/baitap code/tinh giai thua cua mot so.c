#include <stdio.h>

int giaiThua(int n) {
    if (n == 1 || n == 0) // Tru?ng h?p co s?: giai th?a c?a 0 ho?c 1 là 1
        return 1;
    else
        return n * giaiThua(n - 1); // Th?c hi?n d? quy d? tính giai th?a c?a n
}

int main() {
    int n;
    printf("Nhap vao mot so nguyen duong: ");
    scanf("%d", &n);
    printf("Giai thua cua %d la: %d", n, giaiThua(n));
    return 0;
}
