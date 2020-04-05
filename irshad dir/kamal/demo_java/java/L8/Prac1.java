/*wajp to read a string from user and count the number of letters,
digit,and other characters.*/

import java.io.*;
class Prac1{
public static void main(String args[]){
Console c=System.console();
int lc=0,dc=0,oc=0;
String str=c.readLine("Enter a String:");
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(Character.isLetter(ch))
lc++;
else if(Character.isDigit(ch))
dc++;
else
oc++;
}
System.out.println("lc= "+lc+" dc= "+dc+" oc= "+oc);
}
}