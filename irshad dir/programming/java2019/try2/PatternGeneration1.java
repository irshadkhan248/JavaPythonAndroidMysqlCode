/*generate pattern

A
B	B
C	C	C

*/
class PatternGeneration1{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		if(num<0)
			System.out.println("b +ve");
		else
		{
			char ch='A';
			for(int i=1;i<=num;i++){
				for(int j=1;j<=i;j++){
					System.out.print(ch+"\t");
				}
				System.out.print("\n");
				ch++;
			}
		}
	}
}