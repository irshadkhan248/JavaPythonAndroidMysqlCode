class TestQ16
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("0123 456 ");
if(sb.length()==9)
sb.insert(9,"abcde");
sb.delete(2,5);
System.out.println(sb.indexOf("d"));
}
}