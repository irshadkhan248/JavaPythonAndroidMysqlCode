public class Pass{
public static void main(String args[]){
int x=5;
Pass p=new Pass();
x=p.doStuff(x);
System.out.println("main x= "+x);
}
int doStuff(int x){
System.out.println("dostuff x= "+ x++);
return x;
}
}