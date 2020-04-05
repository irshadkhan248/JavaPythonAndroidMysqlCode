class AddDo
{
public static void main(String args[])
{
int j=Integer.parseInt(args[0]);
int i=1,sum=0;
do
{
sum+=i;
i++;
}
while(i<j);
System.out.println("sum "+sum);
}
}