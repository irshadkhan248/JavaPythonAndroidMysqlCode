class A {
	public static void main(String args[])throws InterruptedException{
		char c='a';
		for(int i=0;i<26;i++){
			//c=+c;
			System.out.println(c++);
			Thread.sleep(500);
		}
	}
}
