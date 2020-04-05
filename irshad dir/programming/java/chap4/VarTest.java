class VarTest
{
public static void display(String... names)
{
for(String mynames:names)
System.out.println(mynames);
}
public static void main(String args[])
{
display("anil");
display("sunil","jinil");
display("dheeraj","rita","seeta");
display("anil","ali","kali");
display("savi","kavi","ravi");
}
}
