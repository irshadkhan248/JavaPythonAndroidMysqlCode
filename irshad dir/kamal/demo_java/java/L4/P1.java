/*wajp to read the first 3 letters of months provided by user from command line
 and display the number of days in that months.
hint use the switch statment.
i/p: jan 	o/p 31 	*/

class P1{
public static void main(String args[]){
String month_name=args[0];
switch(month_name)
{
case "jan":System.out.println(31);break;
case "feb":System.out.println(28);break;
case "mar":System.out.println(31);break;
case "apr":System.out.println(30);break;
case "may":System.out.println(31);break;
case "jun":System.out.println(30);break;
case "jul":System.out.println(31);break;
case "aug":System.out.println(31);break;
case "sep":System.out.println(30);break;
case "oct":System.out.println(31);break;
case "nov":System.out.println(30);break;
case "dec":System.out.println(31);break;
default: System.out.println("Invalid input");
}
}
}