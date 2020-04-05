class Q24MT{
public static void main(String args[]){
boolean kg=true;
int result=1;
int i=9;
do{
i--;
if(i==3){
kg=false;
}
result<<=1;
}
while(kg);
System.out.println(result);
}
}