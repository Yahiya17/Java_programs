class student 
{
int roll;
String name;
public void info()
{
System.out.println("Your name is "+this.name);
System.out.println("Your roll no = "+this.roll);
}
student()
{
}
student(student s1)
{
this.name=s1.name;
this.roll=s1.roll;
}
}
class copyconstruct
{
public static void main(String args[])
{
student s1=new student();
s1.name="Karatos";
s1.roll=1;
s1.info();
System.out.println("Copying the s1 object in s2");
student s2=new student(s1);
s2.info();
}
}