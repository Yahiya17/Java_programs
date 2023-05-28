import java.util.*;
class payoutOfBoundsException extends Exception
{
payoutOfBoundsException(String msg)
{
System.out.println("Pay out of bounds exception "+msg);
}
}
class practicalpgm4
{
public static void main(String args[]) throws payoutOfBoundsException
{
System.out.println("Enter the employee salary ");
int pay;
Scanner s=new Scanner(System.in);
pay=s.nextInt();
if(pay<10000||pay>50000)
{
throw new payoutOfBoundsException("Salary not in a valid range ");
}
else
{
System.out.println("Employee is eligible for 30% hike");
}
}
}