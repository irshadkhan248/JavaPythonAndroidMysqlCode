/* input:-a,2,b,4,c,3

o/p:-
a	a
b	b	b	b
c	c	c

*/


import java.io.*;
import java.util.*;
class prac4{
public static void main(String args[]){
String input="a,2,b,4,c,3";
String data[]=input.split(",");
for(int i=0;i<data.length;i=i+2)
{
String what=data[i];
int times=Integer.parseInt(data[i+1]);
int j=1;
while(j<=times){
System.out.print(what+"\t");
j++;
}
System.out.println();
}
}
}