class gradeSwitch
{
public static void main(String args[])
{
int marks,i;
String grade;
marks=Integer.parseInt(args[0]);
i=marks/10;
switch(i)
{
default: grade="fail";
break;
case 10: grade="Destinsion 10"; 
break;
case 9: grade="Destinsion 9";
break;
case 8: grade="Destinsion 8";
break;
case 7:
case 6: grade="First class";
break;

case 4: grade="pass class";
break;

case 5: grade="second class";
break;
}
System.out.println(" marks : "+marks+" grade= : "+grade);
}
}