public abstract class Book
{
pulbic abstract void read()
{
System.out.println("Reading a Book");
}
public static void main(String arg[])
{
Book book=new NonFictionBook();
book.read();
}
}
class NonFictionBook extends Book
{
public abstract void read()
{
System.out.println("Reading a NonFictionBook");
}
}