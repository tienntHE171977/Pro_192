#include<stdio.h>
 main(){
	int n, i, j, a[1000], dem[1000]= {0}, temp[1000];
	scanf("%d", &n);
	int res= 0;
	for(i= 0; i< n; i++){
		scanf("%d", &a[i]);
		dem[a[i]]++;
		if(a[i]%3 == 0){
			temp[res]= a[i];
			res++;
		}
	}
	int k;
	for (i=0;i<res-1;i++){
    	j= i+1;
 		while (j< res)
       	if (temp[i]== temp[j]){
         		for (k= j; k< res-1; k++) temp[k]= temp[k+1];
         		res--;
      		}
      		else j++;
   }
	for(i= 0; i< res; i++){
		printf("%d  %d", dem[a[i]], temp[i]);
		printf("\n");
	}
	return 0;
}
