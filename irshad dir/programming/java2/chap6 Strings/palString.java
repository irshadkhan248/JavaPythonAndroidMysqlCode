//palendrome

class palString
{
public static void main(String args[])
{
String str=args[0];
String i,j;
String len=str.length();
boolean flag=true;
System.out.println("String : "+str);
for(i=0;j=len;i++ ; j--)
{
if(str.charAt(i)==str.charAt(j))
flag=true;
else
{
flag=false;
break;
}
}
if(flag==true)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
