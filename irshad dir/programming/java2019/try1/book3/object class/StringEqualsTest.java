class StringEqualsTest{
	int n;
	StringEqualsTest(int n){this.n=n;}
public static void main(String args[]){
	
	
String s1=new String("java");
String s2=new String("java");
if(s1.equals(s2))
System.out.println("yes");
else
System.out.println("no");

StringEqualsTest set1=new StringEqualsTest(10);
StringEqualsTest set2=new StringEqualsTest(10);
if(set1.equals(set2))
System.out.println("yes");
else
System.out.println("no");
}
}