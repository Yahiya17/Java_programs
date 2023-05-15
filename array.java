import java.util.*;
class array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the data of the array ");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Array data are ");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
Arrays.sort(arr);   
System.out.println("Array after sorting ");
for(int i=0;i<arr.length;i++)
{
System.out.println("Data at arr["+i+"] "+arr[i]);
}
System.out.println("Array length is "+arr.length);
}
}