#include<stdio.h>
#include<string.h>
 int isLetter (char c){
 	c = tolower (c);
 	if(c >= 'a'&& c <= 'z'){
 		return(1);
	 }
	 return (0);
 }
 int isDigrit (char c){
 	if(c >= '0' && c <= '9'){
 		return (1);
	 }
	 return (0);
 }
 int isSpecialChar(char c){
 	if(isDigrit == 0 && isLetter == 0){
 		return (1);
	 }
	 return (0);
 }
 int main(){
 	char a[1000],c=0,d=0,s=0;
 	gets(a);
 	int i;
 	for(i=0;i<strlen(a);i++){
 		if(isLetter (a[i])){
 			c=c+1;
		 }
        else if(isDigrit (a[i])){
 			d = d + 1;
		 }else{
 		s=s+1;
		 }
	 }
	 printf("Character:%d\n",c);
	 printf("Digrit:%d\n",d);
 	 printf("SpecialChar:%d",s);
 	
 	

 	
 	return(0);
 }