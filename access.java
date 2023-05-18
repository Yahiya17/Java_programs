import bank1.bank;
import java.util.*;
class access
{
public static void main(String args[])
{
bank n=new bank();
Scanner s=new Scanner(System.in);
System.out.println("Enter id");
n.id=s.nextInt();
s.nextLine();
System.out.println("Enter name");
n.name=s.nextLine();
System.out.println("Enter Gender M or F");
n.gender=s.next().charAt(0);
n.info();
}
}