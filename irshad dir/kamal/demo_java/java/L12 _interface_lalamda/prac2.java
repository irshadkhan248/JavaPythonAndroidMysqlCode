/*wajp to create interface add with method sum that takes as input two parameter
and return their addition*/
interface Add{
public int sum(int a,int b);
}
class prac2{
public static void main(String args[]){
Add a=(int num1,int num2)->  num1+num2;
int res=a.sum(10,20);
System.out.println("Answer"+res);
}
}