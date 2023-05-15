import java.util.*;

class fibbo
{
static int n1=0,n2=1,n3=0;
static void fibbonacci(int count)
{
if(count>0)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.print(" "+n3);
fibbonacci(count-1);
}
}
public static void main(String args[])
{
int series;
System.out.println("Enter the no to generate fibonacci series ");
Scanner sc=new Scanner(System.in);
series=sc.nextInt();
System.out.println("Fibonacci series ");
System.out.print(n1+" "+n2);
fibbonacci(series);
}
}