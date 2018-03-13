import java.util.*;
 
class hash
{
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();
 
        // adding into HashSet
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements
        System.out.println(h);
	 }
}	