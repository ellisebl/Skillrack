import java.io.*;
class Strreverse
{
  public static void main(String ar[]) throws Exception
  {
    String org,next,before;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    org=br.readLine();
    int n=org.length();
    String beg[]=org.split("_",2);
    next=beg[0];
    int m=next.length();
    StringBuffer aft =new StringBuffer(next);
    aft=aft.reverse();
    if(n!=m)
    {
    System.out.println(aft+"_"+beg[1]);
    }
    if(n==m)
    {
    System.out.println(aft);
    }  
  }
}