class labpgm5
{
public static void main(String args[])
{
int fact=1,num,i;
num=Integer.parseInt(args[0]);
for(i=num;i>1;i--)
{
fact=fact*i;
}
for(i=num;i>1;i--)
{
System.out.print(i +"*");
}
System.out.print(i+"= ");
System.out.println(fact);
}
}