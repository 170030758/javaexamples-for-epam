import java.io.*;
import java.util.*;
public class demo3
{
public static void main(String args[])
{
int n,k,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
k=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==k)
System.out.println(i);
else
System.out.println("-1");
}
}
}