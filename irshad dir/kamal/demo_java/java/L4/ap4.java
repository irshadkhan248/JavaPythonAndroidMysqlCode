/* homeWork TO GENERATE

A	A	A	A
B	B	B
C	C
D

*/

class ap4
{
	public static void main(String args[])
	{
		int i,j,n;
 		n=Integer.parseInt(args[0]);
		if(n<0)
		System.out.println("Be +Ve");
		else{
    		for(i=1;i<=n;i++)
    		{
        		for(j=i;j<=n;j++)
        		{
            			System.out.print((char)(i+64));
        		} 
        		System.out.println("");
    		}
		   }
	}
}