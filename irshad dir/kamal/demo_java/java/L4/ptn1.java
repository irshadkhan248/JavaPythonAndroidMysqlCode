/* program to generate.

*	
*	*
*	*	*
*	*	*	*

*/
class ptn1{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
if(n<0)
System.out.println("Be +ve");
else
{
for(int i=0;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*" + "\t");
}
System.out.println();
}
}
}
}

