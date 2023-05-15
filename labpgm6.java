class labpgm6
{
public static void main(String args[])
{
int n1=1,n2=0,n3,num;
num=Integer.parseInt(args[0]);
System.out.print(n2+" "+n2);
for(int i=2;i<num;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.print(" "+n3);
}
}
}