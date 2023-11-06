#include<stdio.h>
#include<math.h>
#include<ctype.H>
#include<string.h>
int main() {
int n;
scanf("%d",&n);
int a[n];
int i;
for(i = 0; i < n; i++){
scanf("%d",&a[i]);
}
int j;
for(i = 0; i < n - 1; i++){
for(j = i + 1; j < n; j++){
if(a[i] > a[j]){
int tmp = a[i];
a[i] = a[j];
a[j] = tmp;
}
}
}
for(i = 0; i < n; i++){
if(a[i] % 2 == 0){
printf("%d ",a[i]);
}
}
for(i = 0; i < n; i++){
if(a[i] % 2 != 0){
printf("%d ",a[i]);
}
}
}
