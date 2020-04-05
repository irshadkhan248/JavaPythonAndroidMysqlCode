public class Pass2{
public  void main(String args[]){
int x=6;
Pass2 p=new Pass2();
p.dostuff(x);
System.out.println("Main x= "+x);
}
void dostuff(int x){
System.out.println("dostuff x= "+x);
}
}