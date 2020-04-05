class Array2Df
{
static public void main(String args[])
{
int [][]a={{10,20,30,40},
           {50,60,70,80},
           {90,100,110,120}};
sum(a);
}
static public void sum(int[][] ar)
{
int total=0;
for(int i=0;i<ar.length;i++)
{
for(int j=0;j<ar[i].length;j++)
{
total+=ar[i][j];
}
}
System.out.println("sum of array elements= "+total);
}
}