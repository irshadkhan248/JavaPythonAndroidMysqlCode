/*wajp to read marks and find and display grade 
if 
marks >=70 dist
makrs >=60 first
marks >=50 second
marks >=40 pass 
marks >40 fail */

class Grade
{
public static void main(String args[])
{
int g=Integer.parseInt(args[0]);
if (g>=70)
System.out.println("Grade=Distinction");
else if (g>=60)
System.out.println("Grade=First Class");
else if (g>=50)
System.out.println("Grade=Second Class");
else if (g>=40)
System.out.println("Grade=Pass Class");
else
System.out.println("Grade=Fail");
}
}
