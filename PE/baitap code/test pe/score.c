#include <stdio.h>

int main() {
    float score;

    printf("Please enter the score for the subject: ");
    scanf("%f", &score);

    if (score >= 5.0 && score < 7.0) {
        printf("Average rating with a score: %.1f\n", score);
    } else if (score >= 7.0 && score < 8.0) {
        printf("Good rating with a score: %.1f\n", score);
    } else if (score >= 8.0 && score <= 10.0) {
        printf("Excellent rating with a score: %.1f\n", score);
    } else {
        printf("Invalid score. Please enter a value between 5.0 and 10.0.\n");
    }

    return 0;
}

