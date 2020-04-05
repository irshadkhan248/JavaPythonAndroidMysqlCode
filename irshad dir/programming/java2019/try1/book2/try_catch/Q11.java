class Q11
{
public static void parse(String str) {
float f = 0.0f;
try {
f = Float.parseFloat(str);
} catch (Exception nfe) {
f = 0;
}

 finally {
	int a=1,b=0,c;
	c=a/b;
System.out.println(f);
}
}
public static void main(String[] args) {
parse("invalid");
}
}