class CharAtSetChar
{
public static void main(String args[])
{
StringBuffer br=new StringBuffer("java");
System.out.println(br);
System.out.println(br.charAt(0));
br.setCharAt(0,'t');
System.out.println(br);
}
}
