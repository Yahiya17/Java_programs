import java.util.*;
class search
{
public static void input(int arr[],int num)
{
int i;
Scanner s=new Scanner(System.in);
for(i=0;i<num;i++)
{
System.out.print("Enter data ");
arr[i]=s.nextInt();
}
}
public static void output(int arr[],int num)
{
int i;
for(i=0;i<num;i++)
{
System.out.print(arr[i]+"\t");
}
}
public static void linear(int arr[],int num)
{
int i,k=0;
Scanner s=new Scanner(System.in);
System.out.println("\nEnter the key value");
int key=s.nextInt();
for(i=0;i<num;i++)
{
if(arr[i]==key)
{
System.out.println("Key is found");
k=1;
break;
}
}
if(k==0)
System.out.println("Key is not found");
}
public static void binary(int arr[],int num)
{
int i,k=0;
Scanner s=new Scanner(System.in);
System.out.println("\nEnter the key value");
int key=s.nextInt();
int low=0,high=num-1,mid;
Arrays.sort(arr);
while(low<=high)
{
mid=(low+high)/2;
if(arr[mid]==key)
{
System.out.println("Key is  found");
k=1;
break;
}
else if(arr[mid]>key)
high=mid-1;
else
low=mid+1;
}
if(k==0)
System.out.println("Key is not found");
}
public static void main(String args[])
{
int arr[]=new int[20];
int num;
System.out.println("Enter the size of the array ");
Scanner s=new Scanner(System.in);
num=s.nextInt();
input(arr,num);
output(arr,num);
int select;
System.out.println("\nEnter your choice\n1.Linear Search\n2.Binary Search");
select=s.nextInt();
switch(select)
{
case 1:
linear(arr,num);
break;
case 2:
linear(arr,num);
break;
default:
System.out.println("Enter correct choice");
}
}
}