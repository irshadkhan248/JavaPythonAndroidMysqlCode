class A extends Thread{
	public void run(){
		System.out.println("Enter into Thread");
		for(int i=1;i<=5;i++)
			System.out.println('a');
		System.out.println("Exit from main thread");
	}
}
class TD1A{
	public static void main(String args[]){
		System.out.println("main thread started");
		A t1=new A();
		t1.start();
		A a2=new A();
		Thread t2=new Thread(a2);
		t2.start();
		System.out.println("main thread Ended");
	}
}