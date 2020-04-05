/*wajp to read the first 3 letters of months provided by user from command line
 and display the number of days in that months.
hint use the switch statment.
i/p: jan 	o/p 31 	*/

class P2{
public static void main(String args[]){
String month_name=args[0];
switch(month_name)
{
case "jan","mar","may","jul","aug","oct","dec" -> System.out.println(31);
case "feb" -> System.out.println(28);
case "apr","jun","sep","nov" -> System.out.println(30);
default -> System.out.println("Invalid input");
}
}
}