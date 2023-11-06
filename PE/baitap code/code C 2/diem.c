#include <stdio.h>
int main() {
float score;
printf("Enter the score for the subject: ");
scanf("%f", &score);
if (score >= 5.0 && score <= 10.0) {
printf("Passed with the score: %.1f\n", score);
} else if (score >= 0.0 && score < 5.0) {
printf("Failed with the score: %.1f\n", score);
} else {
printf("Invalid score entered\n");
}
return 0;
}
