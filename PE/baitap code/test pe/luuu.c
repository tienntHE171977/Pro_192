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
    // T?o m?ng 10 s? nguy�n d? luu v�o file nh? ph�n
    int arr[NUM_INTS] = {5, 3, 7, 1, 9, 2, 8, 4, 10, 6};

    // M? file d? ghi d? li?u v�o file nh? ph�n
    FILE *fp = fopen("binary_data.bin", "wb");
    if (fp == NULL) {
        perror("Kh�ng th? m? file");
        exit(EXIT_FAILURE);
    }

    // Ghi d? li?u v�o file nh? ph�n
    fwrite(arr, sizeof(int), NUM_INTS, fp);

    // ��ng file
    fclose(fp);

    // M? file d? d?c d? li?u
    fp = fopen("binary_data.bin", "rb");
    if (fp == NULL) {
        perror("Kh�ng th? m? file");
        exit(EXIT_FAILURE);
    }

    // �?t con tr? file ? v? tr� gi?a m?ng
    fseek(fp, sizeof(int) * NUM_INTS / 2, SEEK_SET);

    // T?o m?ng m?i d? luu c�c s? du?c d?c ra t? file
    int new_arr[NUM_INTS / 2];

    // �?c c�c s? nguy�n t? con tr? file
    fread(new_arr, sizeof(int), NUM_INTS / 2, fp);

    // S?p x?p m?ng m?i theo th? t? tang d?n
    qsort(new_arr, NUM_INTS / 2, sizeof(int), compare_ints);

    // ��ng file
    fclose(fp);

    // M? file d? ghi c�c s? d� s?p x?p v�o file m?i
    fp = fopen("sorted_data.bin", "wb");
    if (fp == NULL) {
        perror("Kh�ng th? m? file");
        exit(EXIT_FAILURE);
    }

    // Ghi c�c s? d� s?p x?p v�o file m?i
    fwrite(new_arr, sizeof(int), NUM_INTS / 2, fp);

    // ��ng file
    fclose(fp);

    // In th�ng b�o th�nh c�ng
    printf("Ho�n th�nh\n");

    return 0;
}
