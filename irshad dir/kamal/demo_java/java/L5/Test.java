public class Test{
static int count=0;
int i=0;
public void changeCount(){
while(i<5){
i++;
count++;

}
}
public static void main(String args[]){
Test c1=new Test();
Test c2=new Test();
c1.changeCount();
c2.changeCount();
System.out.println(c1.count + " : "+ c2.count);
}
}