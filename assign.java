class assign
{
public static void main(String... args)
{
//The method parseInt() belongs to the Integer class which is under java. lang package. It is used to parse the string value as a signed //decimal value. It is used in Java for converting a string value to an integer by using the method parseInt().
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int greatest=(a>b)?(a>c)?a:c:(b>c)?b:c;
System.out.println("Greatest among all is "+greatest);
}
}