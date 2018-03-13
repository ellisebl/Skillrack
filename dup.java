import java.util.*;
import java.io.*;
class dup
{
public static void main(String ar[]) throws Exception
{
        int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};
        int arr3[]=new int[50];
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr3[i]=arr1[i];
                    System.out.println(arr1[i]);
                }
            }
        }
        for(int i=0;i<arr3.length;i++)
        {   
            for(int j=0;j<(arr3.length)-1;j++)
            if(arr3[i]==arr3[j])
            {
                 count++;
            }
        }
        System.out.println(count);


}
}