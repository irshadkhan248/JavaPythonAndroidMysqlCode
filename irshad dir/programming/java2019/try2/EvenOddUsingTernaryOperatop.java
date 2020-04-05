//even odd using tarnary operator
class EvenOddUsingTernaryOperatop{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		String ans=num%2==0?"even":"odd";
		System.out.println(ans);
	}
}