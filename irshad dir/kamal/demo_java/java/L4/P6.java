/* to Generate


A
B	B
C	c	C
D	D	D	D

*/


class P6
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
if(num<0)
System.out.println("be +ve");
else
{
char ch='A';
for(int i=1;i<=num;i++)
{
for(int j=1;j<=i;j++)
System.out.print(ch + "\t");
System.out.println();
ch++;
}
}
}
}