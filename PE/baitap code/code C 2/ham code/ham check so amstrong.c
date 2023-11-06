#include <stdio.h>
#include <math.h>
int main() {
int n, originalNum, remainder, result = 0, count = 0;
float power;
scanf("%d", &n);
originalNum = n;
while (originalNum != 0) {
originalNum /= 10;
++count;
}
originalNum = n;
while (originalNum != 0) {
remainder = originalNum % 10;
power = pow(remainder, count);
result += power;
originalNum /= 10;
}
if (result == n)
printf("%d is an armstrong number.", n);
else
printf("%d is not an armstrong number.", n);
return 0;
}
