import java.util.*;
import java.text.*;
class methods
{
public static double area(int r)
{
double ar;
return ar=3.14*r*r;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius");
int r;
r=s.nextInt();
double a;
a=area(r);
DecimalFormat df = new DecimalFormat();
df.setMaximumFractionDigits(2);
System.out.println("Area of the circle = "+df.format(a));
}
}