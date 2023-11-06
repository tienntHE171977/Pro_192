 #include<stdio.h>
 #include<string.h>
 int main () {
 	char s[100];
 	gets(s);
 	 int i = 0;
 
   int vowels = 0;            // bien de dem so nguyen am
   int consonants = 0;        // bien de dem so phu am
      
   while(s[i++] != '\0') {
      if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' )
         vowels++;
      else
         consonants++;
   }
   printf("%s %d %d",s,vowels,consonants);
 }

