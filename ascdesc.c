#include<stdio.h>

int main()
{
    int n=0,m=0,i,k=0,j,temp=0;
    scanf("%d",&n);
    int a[50],even[50],odd[50];
   
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
	 for(i=0;i<n;i++)
 	{	
    	if(a[i]%2==0)
    	{
    			even[m]=a[i];
    			m++;
    	}
	    
    	if(a[i]%2!=0)
    	{
    	
    	
       			odd[k]=a[i];
        			k++;
    	}
	}
	for(i=0;i<m-1;i++)
	{
		if(even[i]<even[i+1])
		{
			temp=even[i];
			even[i]=even[i+1];
			even[i]=temp;
		}
	}
	for(i=0;i<k-1;i++)
	{
		if(odd[i]<odd[i+1])
		{
			temp=odd[i];
			odd[i]=odd[i+1];
			odd[i]=temp;
		}
	}
	
		for( i=0;i<m;i++)
		{
			printf("%d ",even[i]);
		}
		printf("/n")
		for( i=0;i<k;i++)
			printf("%d ",odd[i]);
    	
    
    return 0;
}