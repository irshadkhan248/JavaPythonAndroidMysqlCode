/*factroial of given number*/ 
class Fact{
public static void main(String args[]){
int num=Integer.parseInt(args[0]);
int sum=0;
int fact=1;
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factroial of "+ num +"="+ fact);
}
}