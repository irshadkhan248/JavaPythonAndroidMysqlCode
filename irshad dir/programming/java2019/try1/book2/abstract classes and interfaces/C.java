interface A{
	int x=20;
	void method();
}
interface B{
	int x=30;
	void method();
}
class C implements A,B{
	public void method(){
		System.out.println("A's X="+A.x +" B's X="+B.x);
	}
	public static void main(String args[]){
		C in=new C();
		in.method();
	}
}