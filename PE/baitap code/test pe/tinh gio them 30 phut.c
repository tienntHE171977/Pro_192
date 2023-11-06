#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main() {

 int hh,mm,ss;

 do {
 scanf("%d",&hh);
 } while(hh < 0 || hh > 23);

 do {
 scanf("%d",&mm);
 } while(mm < 0 || mm > 59);

 do {
 scanf("%d",&ss);
 } while(ss < 0 || ss > 59);

 if(mm < 30) {
 mm += 30;
 printf("%d:%d:%d",hh,mm,ss);
 } else if(mm >= 30) {
 mm -= 30;
 if(hh == 23) {
 hh = 0;
 printf("%d:%d:%d",hh,mm,ss);
 } else if(hh < 23) {
 hh += 1;
 printf("%d:%d:%d",hh,mm,ss);
 }

 }

}
