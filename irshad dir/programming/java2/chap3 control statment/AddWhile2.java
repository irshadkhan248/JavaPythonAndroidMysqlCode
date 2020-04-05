class AddWhile2
{
public static void main(String args[])
{
int j=Integer.parseInt(args[0]);
if(j>0)
{
int i=0,sum=0;
while(i<j)
{
sum+=i;
i++;
}
System.out.println("sum of "+j+" integers is "+sum);
}
else
System.out.println("Invalid Enter please enter bigger than 0");
}
}