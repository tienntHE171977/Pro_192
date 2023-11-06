#include <stdio.h>
#include <stdlib.h>

#define NUM_INTS 10

int compare_ints(const void *a, const void *b)
{
    int int_a = *(int *)a;
    int int_b = *(int *)b;

    if (int_a == int_b) {
        return 0;
    } else if (int_a < int_b) {
        return -1;
    } else {
        return 1;
    }
}

int main()
{
    // T?o m?ng 10 s? nguyên d? luu vào file nh? phân
    int arr[NUM_INTS] = {5, 3, 7, 1, 9, 2, 8, 4, 10, 6};

    // M? file d? ghi d? li?u vào file nh? phân
    FILE *fp = fopen("binary_data.bin", "wb");
    if (fp == NULL) {
        perror("Không th? m? file");
        exit(EXIT_FAILURE);
    }

    // Ghi d? li?u vào file nh? phân
    fwrite(arr, sizeof(int), NUM_INTS, fp);

    // Ðóng file
    fclose(fp);

    // M? file d? d?c d? li?u
    fp = fopen("binary_data.bin", "rb");
    if (fp == NULL) {
        perror("Không th? m? file");
        exit(EXIT_FAILURE);
    }

    // Ð?t con tr? file ? v? trí gi?a m?ng
    fseek(fp, sizeof(int) * NUM_INTS / 2, SEEK_SET);

    // T?o m?ng m?i d? luu các s? du?c d?c ra t? file
    int new_arr[NUM_INTS / 2];

    // Ð?c các s? nguyên t? con tr? file
    fread(new_arr, sizeof(int), NUM_INTS / 2, fp);

    // S?p x?p m?ng m?i theo th? t? tang d?n
    qsort(new_arr, NUM_INTS / 2, sizeof(int), compare_ints);

    // Ðóng file
    fclose(fp);

    // M? file d? ghi các s? dã s?p x?p vào file m?i
    fp = fopen("sorted_data.bin", "wb");
    if (fp == NULL) {
        perror("Không th? m? file");
        exit(EXIT_FAILURE);
    }

    // Ghi các s? dã s?p x?p vào file m?i
    fwrite(new_arr, sizeof(int), NUM_INTS / 2, fp);

    // Ðóng file
    fclose(fp);

    // In thông báo thành công
    printf("Hoàn thành\n");

    return 0;
}
