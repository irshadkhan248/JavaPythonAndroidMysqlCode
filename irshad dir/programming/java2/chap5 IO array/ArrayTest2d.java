class ArrayTest2d
{
public static void main(String args[])
{
int a[][]={	{10,20,30},
		{40,50,60},		
		{70,80,90}
	  };
int b[][];
b=a;
for(int i=0;i<b.length;i++)
{
for(int j=0;i<b.length;i++)
System.out.println(b[j]);
}
}
}