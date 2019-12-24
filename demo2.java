import java.io.*;
import java.util.*;
public class demo2
{
public static void main(String args[])
{
int n,min,max,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
max=a[0];
min=a[0];
for(i=0;i<n;i++)
{
if(max<a[i])
max=a[i];
if(min>a[i])
min=a[i];
}
System.out.println("Max: "+max+" Min: "+min);
}
}