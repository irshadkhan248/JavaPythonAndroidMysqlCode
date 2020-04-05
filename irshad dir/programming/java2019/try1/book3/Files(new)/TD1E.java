class B implements Runnable{
	public void run(){
		System.out.println("Enter into thread "+Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
			try{
				System.out.println("Enter into thread "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Exit from thread "+Thread.currentThread().getName());
	}
}
class TD1E{
	public static void main(String args[]){
		System.out.println("Main Thread Started");
		B b1=new B();
		Thread t1=new Thread(b1,"Ravi");
		t1.start();
		
		B b2=new B();
		Thread t2=new Thread(b2,"Kavi");
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Main thread Ended ");
	}
}