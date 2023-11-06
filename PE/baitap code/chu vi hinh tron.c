#include <stdio.h>

int main() {
    float ban_kinh, chu_vi;
    const float PI = 3.14159;

    printf("Nhap vao ban kinh hinh tron: ");
    scanf("%f", &ban_kinh);

    chu_vi = 2 * PI * ban_kinh;

    printf("Chu vi cua hinh tron la: %.2f", chu_vi);

    return 0;
}
