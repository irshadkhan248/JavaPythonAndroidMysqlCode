/*reverse of given number*/

class RevNum{
public static void main(String args[]){
int num=Integer.parseInt(args[0]);
int rev=0;
if (num<0)
System.out.println("Be +ve");
else
{
while(num>0){
int digit=num%10;
rev=rev*10+digit;
num/=10;
}
System.out.println("Reverse of number"+rev);
}

}
}
