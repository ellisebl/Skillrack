import java.util.*;
import java.io.*;
public class Ascstr
 {

    public static void main(String[] args) throws Exception
    {
	String s;
	int i,temp,j,m;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	s=br.readLine();
	int n=s.length();
	char c[]=s.toCharArray();	
	int a[]=new int[n];
	for(i=0;i<n;i++)
	    {
	     	a[i]=c[i];
	    }
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(a[j]<a[j+1])
				{

                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
				}
		}
	}
	int k=0;
	int t[]=new int[n];
	for (i=0; i<n-1; i++)
	{  
            if (a[i] != a[i+1])
            {  
                t[k++] = a[i];  
            }  
     }  
     t[k++] = a[n-1];     
	
	for(i=0;i<k;i++)
		{
		System.out.print((char)t[i]);	
		}
	}
}