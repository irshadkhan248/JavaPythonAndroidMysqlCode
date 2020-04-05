class VargTest
{
public static void display(String... names)
{
for(String mynames:names)
System.out.println(mynames);
}

public static void main(String... args)
{
display("a");
display("b","c");
display("d","e","f");
display("g","h","i","j","l");
}
}