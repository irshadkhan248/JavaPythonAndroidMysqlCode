//sum of digit
class P2{
public static void main(String args[]){
int sum=0,last_digit,num;
num=Integer.parseInt(args[0]);
while(num>0){
last_digit=num%10;
sum=sum+last_digit;
num/=10;
}
System.out.println("sum of digits:"+sum);
}
}