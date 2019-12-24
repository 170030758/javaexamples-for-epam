import java.util.*;
import java.io.*;
 class demo
{
public static void main(String args[])
{
float avg;
int i;
int a[]={1,2,3,4,5},sum=0;
for(i=0;i<5;i++)
{
sum=sum+a[i];
}
avg=(float)sum/5;
System.out.println(sum);
System.out.println(avg);
}
}