//fabnoserises
class P6{
public static void main(String args[]){
int count,n1=0,n2=1,n3;
count=Integer.parseInt(args[0]);
System.out.print(n1+" "+n2);
for(int i=2;i<=count;i++){
n3=n2+n1;
System.out.print(" "+n3+" ");
n1=n2;
n2=n3;
}
}
}