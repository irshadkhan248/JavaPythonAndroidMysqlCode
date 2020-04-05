class switchTest
{
public static void main(String args[])
{
System.out.println("value= "+switchlt(1));
}
public static int switchlt(int x)
{
int j=1;
switch(x)
{
case 1:j++;
case 2:j++;
case 3:j++;
case 4:j++;
case 5:j++;
default:j++;
}
System.out.println("value of j = "+j);
System.out.println("value of x = "+x);
return j+x;
}
}

/*default:System.out.println("default");
case '3':System.out.println("3");
case '4':System.out.println("4");
//case 'b':System.out.println("blue");

}
}*/