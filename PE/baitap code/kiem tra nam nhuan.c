#include <stdio.h>

int is_leap_year(int year) {
    if (year % 4 != 0) {
        return 0;
    }
    else if (year % 100 != 0) {
        return 1;
    }
    else if (year % 400 != 0) {
        return 0;
    }
    else {
        return 1;
    }
}

int main() {
    int year;
    printf("Nhap vao nam can kiem tra: ");
    scanf("%d", &year);
    if (is_leap_year(year)) {
        printf("%d la nam nhuan\n", year);
    }
    else {
        printf("%d khong phai la nam nhuan\n", year);
    }
    return 0;
}
