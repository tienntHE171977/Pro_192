#include <stdio.h>

int main() {
    int h, m, s;
    scanf("%d %d %d", &h, &m, &s);

    // Convert the given time into seconds
    int totalSeconds = (h * 60 + m) * 60 + s;

    // Add 30 minutes (1800 seconds)
    totalSeconds += 1800;

    // Calculate the new hours, minutes and seconds
    int newH = totalSeconds / 3600;
    int newM = (totalSeconds % 3600) / 60;
    int newS = (totalSeconds % 3600) % 60;

    // Print the result in the required format
    printf("%02d:%02d:%02d", newH, newM, newS);

    return 0;
}
