class labpgm3
{
public static void main(String args[])
{
int n1=15,n2=10,big,gcd=0,i;
if(n1>n2)big=n1;
else big=n2;
for(i=1;i<=big;i++)
{
if(n1%i==0 && n2%i==0)
gcd=i;
}
System.out.println("Gcd of two no is " +gcd);
}
}