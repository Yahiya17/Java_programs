package bank1;

public class bank
{
public int id;
public String name;
public char gender;
public void info()
{
System.out.println("Bank is account is created");
System.out.println("Your name ="+this.name);
System.out.println("Your id ="+this.id);
if(gender=='m' || gender =='M')
System.out.println("Your Gender is Male");
else if(gender=='f' || gender=='F')
System.out.println("Your Gender is Female");
else
System.out.println("Your Gender is not defined");
}
}
