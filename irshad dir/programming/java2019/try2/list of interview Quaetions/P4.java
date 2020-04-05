/*pattern

A

B	B

C	c	c

*/ 
class P4{
public static void main(String args[]){
int num=Integer.parseInt(args[0]);
char c='A';
for(int i=1;i<=num;i++){
for(int j=1;j<=i;j++){
System.out.print(c+"\t");
}
System.out.println("\n\n");
c++;
}
}
}