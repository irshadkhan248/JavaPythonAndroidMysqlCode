class B implements Runnable{
	public void run(){
		System.out.println("Enter into Thread");
		for(int i=1;i<=5;i++)
			System.out.println('a');
		System.out.println("Exit from main thread");
	}
}
class TD1C{
	public static void main(String args[]){
		System.out.println("main thread started");
		A a=new A();
		Thread t2=new Thread(a);
		t2.start();
		
		A a2=new A();
		Thread t1=new Thread(a2);
		t1.start();
		System.out.println("main thread Ended");
	}
}