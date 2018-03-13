#include<stdio.h>
#include <stdlib.h>
#include<string.h>

int main()
{
    char a[100],b[100];
    int i,n,m,j,k,count=0;
    scanf("%s",a);
    scanf("%s",b);
    n=strlen(a);
    m=strlen(b);
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            for(k=j+1;k<m;k++)
            {
                if(b[k]!=a[j])
                {
                    if(b[k]==a[i])
                    {
                        count=count+1;
                    }
                }
            }
        }
    }
    printf("%d",count);

}