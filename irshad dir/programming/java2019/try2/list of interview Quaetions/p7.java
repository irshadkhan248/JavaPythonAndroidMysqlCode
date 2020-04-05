//armstrong number

class P7{
public static void main(String args[]){
int num,last_digit,sum=0;
num=Integer.parseInt(args[0]);
int org_num=num;
while(num>0){
last_digit=num%10;
sum=sum+(last_digit*last_digit*last_digit);
num/=10;
}
if(sum==org_num)
System.out.println("armstrong");
else
System.out.println("not armstrong");
}
}