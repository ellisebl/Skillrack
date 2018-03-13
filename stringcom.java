import java.util.*;
import java.io.*;
class stringcom 
{
public static void main(String ar[]) throws Exception
{
	String one,two;
	int n,i,k=0,m,count=0,j,l=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	one=br.readLine();
	two=br.readLine();
	n=one.length();
	m=two.length();
	char t[]=new char[n];
	char w[]=new char[m];
	char o[]=one.toCharArray();
	char tw[]=two.toCharArray();
	for (i=0; i<n-1; i++)
	{  
            if (o[i] != o[i+1])
            {  
                t[k++] = o[i];  
            }  
     }  
     t[k++] = o[n-1]; 
      for(i=0;i<k;i++)
     {
     	System.out.println(t[i]);
     }   

	int x=0;
	for (i=0; i<m-1; i++)
	{  
            if (tw[i] != tw[i+1])
            {  
                w[x++] = tw[i];  
            }  
     }  
     w[x++] = tw[m-1];
     for(i=0;i<x;i++)
     {
     	System.out.println(w[i]);
     }  

	 for(i=0;i<k;i++)
		{
			for(j=0;j<x;j++)
			{
			if(t[i]==w[j])
				{	
					count++;	
				}
			}
		}
		System.out.println(count);
}
}