/*wajp to create interface add with method sum that takes as input two parameter
and return their addition*/

interface Add{
public int sum(int a,int b);
}
class C1 implements Add{
public int sum(int a,int b){
return a+b;
}
}
class prac1{
public static void main(String args[]){
C1 c=new C1();
int ans=c.sum(10,20);
System.out.println("Answer"+ans);

Add a=(int num1,int num2)->{return num1+num2;};
int res=a.sum(10,20);
System.out.println("Answer"+res);
}
}