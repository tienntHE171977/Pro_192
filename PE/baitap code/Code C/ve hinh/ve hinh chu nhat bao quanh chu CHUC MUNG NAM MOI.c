///////ve hinh chu nhat bao quanh chu CHUC MUNG NAM MOI
#include <stdio.h>

int main() {
  int n, i, j;
  while(1==1){
  scanf("%d",&n);
  n=19;
  for( i=1;i<=3;i++){
    for( j=1;j<=n;j++)
    {
      if(i==1||i==3||i==2&&j==1||i==2&&j==n) printf("* ");
      //if(i==2&&j>1&&j<n) printf(" ");
      if(i==2&&j==2) printf("  C h u c  M u n g  N a m  M o i  ");
    }
      printf("\n");
  }
        printf("\n");
  }
  return 0;
}
