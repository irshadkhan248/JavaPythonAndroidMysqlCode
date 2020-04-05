interface E1{
	int getStLe(String s);}
class C1 implements E1{
	public int  getStLe(String s){
		int l=s.length();
		System.out.println("Length "+l);
		return 0;}
	public static void main(String args[]){
		C1 c=new C1();
		c.getStLe("Shah Rukh Khan");}}