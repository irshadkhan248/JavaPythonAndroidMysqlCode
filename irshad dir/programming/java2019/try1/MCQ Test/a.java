class a{
public void testIfA() {
if (testIfB("True")) {
System.out.println("True");
} else {
System.out.println("Not true");
 }
}
 public boolean testIfB(String str) {
return Boolean.valueOf(str);
 }
 public static void main(String args[]){
	 a A=new a();
	 A.testIfA();
 }
}