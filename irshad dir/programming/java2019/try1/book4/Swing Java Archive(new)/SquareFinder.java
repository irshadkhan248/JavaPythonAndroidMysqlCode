//package p11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SquareFinder extends JFrame{
	JLabel lblEntNum;
	JTextField jtfNum;
	JButton answer,clear;
	JLabel result;
	Container c;
	class L1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			try{
			int a=Integer.parseInt(jtfNum.getText());
			float s=a*a;
			result.setText("Square of Number "+a+" is "+s+".");
			}catch(NumberFormatException e){
				if(jtfNum.getText().length()==0){
					JOptionPane.showMessageDialog(c,"Text Field Cannot be empty! ", "Error", JOptionPane.ERROR_MESSAGE);
				jtfNum.setText("");
				jtfNum.requestFocus();
				}
				else{
				JOptionPane.showMessageDialog(c,"Please Enter Correct Input!", "Error", JOptionPane.ERROR_MESSAGE);
				jtfNum.setText("");
				jtfNum.requestFocus();
				}
			}
		}
	}
	class L3 implements KeyListener{
		public void keyPressed(KeyEvent ke){
			if(ke.getKeyCode()==KeyEvent.VK_ENTER){
					try{
			int a=Integer.parseInt(jtfNum.getText());
			float s=a*a;
			result.setText("Square of Number "+a+" is "+s+".");
			}catch(NumberFormatException e){
				if(jtfNum.getText().length()==0){
					JOptionPane.showMessageDialog(c,"Text Field Cannot be empty! ", "Error", JOptionPane.ERROR_MESSAGE);
				jtfNum.setText("");
				jtfNum.requestFocus();
				}
				else{
				JOptionPane.showMessageDialog(c,"Please Enter Correct Input!", "Error", JOptionPane.ERROR_MESSAGE);
				jtfNum.setText("");
				jtfNum.requestFocus();
				}
			}
			}
		}
		public void keyReleased(KeyEvent ke){}
		public void keyTyped (KeyEvent ke){}
	}
	class L4 implements WindowListener{
		public void windowActivated(WindowEvent we){}
		public void windowDeactivated(WindowEvent we){}		
		public void windowOpened(WindowEvent we){
			JOptionPane.showMessageDialog(c,"Welcome to SquareFinder clac");	
		}
		public void windowClosed(WindowEvent we){}
		public void windowClosing(WindowEvent we){
			int output=JOptionPane.showConfirmDialog(c,"Do you want to Exit");
			if(output==JOptionPane.YES_OPTION){
				System.exit(1);
			}
			 if(output==JOptionPane.NO_OPTION){
				return;
			 }
			// if(output==JOptionPane.CANCLE_OPTION){
				// return;
			// }
		}							
		public void windowIconified(WindowEvent we){}
		public void windowDeiconified(WindowEvent we){}	
	}
	public class L5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			result.setText("");
			jtfNum.setText("");
			jtfNum.requestFocus();
		}
	}
	SquareFinder(){
		c=getContentPane();
		lblEntNum=new JLabel("Enter a Number");
		jtfNum=new JTextField(15);
		answer=new JButton("Answer");
		clear=new JButton("Clear All");

		result=new JLabel();
		c.setLayout(new FlowLayout());
		setSize(200,300);
		setTitle("SquareFinder");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		c.add(lblEntNum);
		c.add(jtfNum);
		c.add(answer);
		c.add(result);
		c.add(clear);
		L1 a=new L1();
		L3 b=new L3(); 
		L4 c=new L4();
		L5 d=new L5();
		clear.addActionListener(d);
		answer.addActionListener(a);
		answer.addKeyListener(b);
		this.addWindowListener(c);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	public static void main(String args[]){
		SquareFinder sf=new SquareFinder();
	}
}