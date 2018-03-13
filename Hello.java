import java.util.*;
import java.io.*;
public class Hello
{
    public static void main(String[] args)throws Exception
    {
         String org,next,before;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         org=br.readLine();
         int n=org.length();
         String beg[]=org.split("-",2);
         next=beg[0];
         int m=next.length();
         StringBuffer aft=new StringBuffer(next);
         aft=aft.reverse();
         if(n!=m)
         {
             System.out.println(aft+"-"+beg[1]);
         }
         if(n==m)
         {
             System.out.println(aft);
         }
        
            

	}
}