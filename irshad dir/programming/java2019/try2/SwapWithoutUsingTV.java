//swap without using third veriable.
class SwapWithoutUsingTV{
static int num1,num2;
public static void main(String args[]){
num1=Integer.parseInt(args[0]);
num2=Integer.parseInt(args[1]);
System.out.println("Before Swap \n"+"num1="+num1+"  num2="+num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("After Swap \n"+"num1="+num1+"  num2="+num2);
}
}