class Building{}
public class Bran extends Building{
public static void main(String args[]){
Building build1=new Building();
Barn bran1=new Bran();
Bran bran2=(Bran)build1;
Object obj1=(Object)build1;
Building build2=(Building)bran1;
}
}