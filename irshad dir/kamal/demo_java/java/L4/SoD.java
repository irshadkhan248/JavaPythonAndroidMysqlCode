/*sum of digit*/
class SoD{
public static void main(String args[]){
int num=Integer.parseInt(args[0]);
int digit,n,sum=0;
if(num<0)
System.out.println("Be +Ve");
else
{
while(num>0)
{
digit=num%10;
sum+=digit;
num=num/10;
}
System.out.println("Sum of" +num +"="+sum);
}
}
}