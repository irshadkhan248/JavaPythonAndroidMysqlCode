import javax.swing.*;
class F1 extends JFrame{
	F1(){
		setSize(200,200);
		setTitle("First GUI");
		setLocation(100, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
	public static void main(String args[]){
		F1 f=new F1();
		// f.setSize(200,200);
		// f.setTitle("First GUI");
		// f.setLocation(100, 50);
		// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// f.setVisible(true);
	}
}