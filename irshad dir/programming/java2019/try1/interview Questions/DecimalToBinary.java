//decimal to binary
class DecimalToBinary{
	public static void main(String args[]){
		int i=0;
		int BinaryNum[]=new int[1000];
		int inpNum=Integer.parseInt(args[0]);
		while(inpNum>0){
			BinaryNum[i]=inpNum%2;
			inpNum=inpNum/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(BinaryNum[j]);
	}
}		