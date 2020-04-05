//read number from cmdline an dexchange it using third veriable.
class SwapUsintTV{
	public static void main(String args[]){
		int numA,numB,numC;
		numA=Integer.parseInt(args[0]);
		numB=Integer.parseInt(args[1]);
		System.out.println("Before Swap \n"+"numA="+numA+"  numB="+numB);
		numC=numA;
		numA=numB;
		numB=numC;
		System.out.println("After Swap \n"+"numA="+numA+"  numB="+numB);
	}
}