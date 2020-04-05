//reverse of digits.
class P3{
public static void main(String args[]){
int num,last_digit=0,rev=0;
num=Integer.parseInt(args[0]);
while(num>0){
last_digit=num%10;
rev=rev*10+last_digit;
num=num/10;
}
System.out.println("reverse of digits:"+rev);
}
}