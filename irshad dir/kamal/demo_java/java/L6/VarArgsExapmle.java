class VarArgsExapmle{
public static void main(String args[]){
sum(1,2,3,4);
sum(50,60);
}
public  static void sum(int ...a){
int s=0;
for(int i=0;i<a.length;i++){
s+=a[i];
}
System.out.println("The sum is "+s);
}
}