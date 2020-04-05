class A{
	public static void main(String args[]){
		int num=100;
		try{
			
			System.out.println(num);
			
		}catch(Exception e){
			
		}finally{
			num++;
			System.out.println(num);
		}
	}
}