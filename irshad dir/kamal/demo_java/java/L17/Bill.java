//wajp for billing software

import java.io.*;
import java.util.*;
class Bill{
public static void main(String args[]){
Console c=System.console();
HashMap<String,Double>menu=new HashMap<>();
menu.put("idli",25.00);
menu.put("poha",20.00);
menu.put("upma",20.00);
double amount=0.0;
while(true){
int op=Integer.parseInt(c.readLine("1 add, 2 amount and 3 exit "));
if(op==1){
	String name=c.readLine("Please Enter Item Name:");

	//System.out.println("Price of Entered Item "+ it +" : "+menu.get(it));
	Double price=menu.get(name);
	if(price==null){
	System.out.println("Invalid item");
	}	
	else{
		int qty=Integer.parseInt(c.readLine("Enter Quantity ordered:"));
		amount=amount+price* qty;
	}
	}		//endOfIf

else if(op==2){
System.out.println("Billing Amount"+amount);
}
else if(op==3){
break;
}
else{
System.out.println("invalid opteion");
}
}
}
}