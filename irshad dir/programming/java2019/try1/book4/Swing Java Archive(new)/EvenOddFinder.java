package p2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EvenOddFinder extends JFrame{
	Container c;
	JLabel l1;
	JTextField t1;
	JButton b1;
	EvenOddFinder(){
		c=getContentPane();
		c.setLayout(null);
		l1=new JLabel("Enter number");
		t1=new JTextField(20);
		l1.setBounds(100,100,80,30);
		t1.setBounds(200,100,80,30);
		b1=new JButton("Find");
		b1.setBounds(150,200,80,30);
		c.add(l1);
		c.add(t1);
		c.add(b1);
		L1 a=new L1(); 
		b1.addActionListener(a);
		
	}
	class L1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			try{
			int num=Integer.parseInt(t1.getText());
			if(num%2==0){
				JOptionPane.showMessageDialog(c,"Yes "+num+" is Even");
				t1.setText("");
				t1.requestFocus();
			}
			else{
				JOptionPane.showMessageDialog(c,"Yes "+num+" is ODD");
				t1.setText("");
				t1.requestFocus();
			}
		}catch(Exception e){
			if(t1.getText().length()==0){
				JOptionPane.showMessageDialog(c, " no input found ", " Error Message ", JOptionPane.ERROR_MESSAGE);
				t1.setText("");
				t1.requestFocus();
				return;
				
			}
			JOptionPane.showMessageDialog(c, " Incorrect input ", " Error Message ", JOptionPane.ERROR_MESSAGE);
			t1.setText("");
			t1.requestFocus();
			return;
		}
		}
	}
	public static void main(String args[]){
		EvenOddFinder EOF=new EvenOddFinder();
		EOF.setSize(350,400);
		EOF.setTitle("Sandwich Order");
		EOF.setLocationRelativeTo(null);
		EOF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EOF.setVisible(true);
	}
}