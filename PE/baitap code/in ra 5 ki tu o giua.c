#include<stdio.h>
#include<string.h>
int main(){
char a[20] = "";
int count = 0;
while(count < 5 || count > 20 && count%2!=0){
printf("Enter String: ");
scanf("%s", &a);
count = strlen(a);
}
int i = 0, j = strlen(a);
while(j-i!=5){
i++;
j--;
}
for(; i < j; i++){
printf("%c", a[i]);
}
}
