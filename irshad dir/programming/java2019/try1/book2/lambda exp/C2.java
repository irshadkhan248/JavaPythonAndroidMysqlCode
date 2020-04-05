@FunctionalInterface
interface E1{
	int getStLe(String s);}
class C2{
	public static void main(String args[]){
E1 a=(String str) -> {return str.length();};
		int l=a.getStLe("Shah Rukh Khan");
		System.out.println(l);}}