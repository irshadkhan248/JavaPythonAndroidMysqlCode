@FunctionalInterface
interface DoNothing{
	void doNothing();
}
@FunctionalInterface
interface dontDoAnything extends DoNothing{
}
class LambdaTest{
	public static void main(String args[]){
		dontDoAnything b=()->{System.out.println("be idle");};
		b.doNothing();
	}
}