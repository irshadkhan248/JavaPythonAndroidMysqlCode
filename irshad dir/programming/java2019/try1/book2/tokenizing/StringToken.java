class StringToken{
public static void main(String args[]){
String data="4 80 5 61 75";
String num[]=data.split(""\\s"");
int a,b,c,res;
a=Integer.parseInt(num[0]);
b=Integer.parseInt(num[1]);
c=Integer.parseInt(num[2]);
res=a+b+c;
System.out.println(res);
}
}