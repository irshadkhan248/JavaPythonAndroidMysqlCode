class Reverse implements Runnable{
	int available=1;
	int wanted;
	Reverse(int i){
		wanted=i;
	}
	public void run(){
		System.out.println("Available="+available);
		if(available>=wanted){
			String name=Thread.currentThread().getName();
			System.out.println(wanted+" Ticket Booked for "+name);
			try{
				Thread.sleep(1500);
				available-=wanted;
			}catch(InterruptedException e){}
		}
		else{
			System.out.println("Sorry no ticket Available");
		}
	}
}
class TicketBook1{
	public static void main(String args[]){
		Reverse obj1=new Reverse(1);
		Thread t1=new Thread(obj1,"Ravi");
		Thread t2=new Thread(obj1,"Kavi");
		t1.start();
		t2.start();
	}
}