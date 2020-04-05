class Overloading{
void x(int i){
System.out.println("one");
}
void x(String i){
System.out.println("two");
}
void x(double i){
System.out.println("Three");
}
public static void main(String args[]){
new Overloading().x(4.0);
Overloading ol=new Overloading();
ol.x(4);
ol.x(" ");
}

}