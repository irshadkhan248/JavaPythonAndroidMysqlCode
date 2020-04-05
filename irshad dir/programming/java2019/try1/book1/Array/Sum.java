class Sum{
public static void sum(int... a){
int sum1=0;
for(int i=0;i<a.length;i++){
sum1+=a[i];
}
System.out.println(sum1);
}
public static void main(String args[]){
sum(10,20,30,40);
sum(100,200);
}
}