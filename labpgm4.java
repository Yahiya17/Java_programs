class labpgm4
{
public static void main(String args[])
{
int k=0;
int num=Integer.parseInt(args[0]);
for(int i=2;i<num;i++)
{
if(num%i==0)
{
k=1;
break;
}
}
if(k==0)
System.out.println("The no you have entereed is prime no");
else
System.out.println("The no you have entereed is not prime");
}
}