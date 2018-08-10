/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int swap(int itself,int dummy)
    {
        return itself; 
	}
    static void sortit(int []arr,int n)
    {
         for(int i=0;i < n;i++)
         {
            while(i != (arr[i]-1))
            arr[i]=swap(arr[arr[i]-1],
               arr[arr[i] -1]=arr[i]);
         }
     }
     public static void main(String args[])
     {
        int[]arr={1,2,3};
        int n=arr.length;
        sortit(arr,n);
        for(int i=0;i<n;i++)
        System.out.println(arr[i] +" ");
     }
}
