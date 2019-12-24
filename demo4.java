import java.io.*;
import java.util.*;
public class demo4
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
char c=(char)a[i];
System.out.println("Corresponding Character: "+c);
}
}
}