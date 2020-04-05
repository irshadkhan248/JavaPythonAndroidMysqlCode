class StringToken5{
public static void main(String args[]){
String s="a1b2c3d4";
String arr[]=s.split("\\d");

for(String str:arr)
System.out.println(str);
//int a=Integer.parseInt(arr[0]);
//int b=Integer.parseInt(arr[1]);
//int c=Integer.parseInt(arr[2]);
//int d=Integer.parseInt(arr[3]);
//int e=Integer.parseInt(arr[4]);
//int result=(a+b+c);
//System.out.println(result);
}
}