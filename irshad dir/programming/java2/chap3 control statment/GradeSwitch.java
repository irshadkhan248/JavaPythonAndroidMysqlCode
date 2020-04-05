class GradeSwitch
{
public static void main(String args[])
{
int marks,i;
String grade;
marks=Integer.parseInt(args[0]);
if(marks<=100)
{
i=marks/10;
switch(i)
{
case 10: grade="Destincatin";
           break;
case 9: grade="Destincatin";
           break;
case 8: grade="Destincatin";
           break;
case 7: grade="Destincatin";
           break;
case 6: grade="First class";
           break;
case 5: grade="Second class";
           break;
case 4: grade="Pass class";
           break;
default: grade="fail";
	break;
}
System.out.println("Marks: "+marks+" grade: "+grade);
}
else
System.out.println(" maximum marks could be less than 100 ");
}
}