class animal
{
int legs,eyes;
String color;
void info()
{
System.out.println(this.color);
System.out.println(this.legs);
System.out.println(this.eyes);
}
animal()
{
System.out.println("You have created a animal");
}
}
class horse extends animal
{
horse()
{
System.out.println("You have created a horse");
}
}

class check
{
public static void hello()
{
System.out.println("Heeelllooo");
}
public static void main(String args[])
{
hello();
animal k=new animal();
k.legs=4;
k.eyes=2;
k.color="RED";
k.info();
k.info();
horse h=new horse();
h.legs=4;
h.eyes=8;
h.color="White";
h.info();
}
}