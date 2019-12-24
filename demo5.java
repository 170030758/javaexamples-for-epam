import java.io.*;
import java.util.*;
public class demo5
{
public static void main(String args[])
{
int n,i,temp,j;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Max1: "+a[n-1]+" Max2: "+a[n-2]+" Min1: "+a[0]+" Min2: "+a[1]);
}
}