//prime number

class p8{
public static void main(String args[]){
int num,flag=0,m;
num=Integer.parseInt(args[0]);
if(num==0 || num==1)
System.out.println("not prime number");
else{
m=num/2;
for(int i=2;i<=m;i++){
if(num%i==0){
System.out.println("Not Prime Number");
flag=1;
break;
}
}
if(flag==0)
System.out.println("Prime Number");
}
}
}