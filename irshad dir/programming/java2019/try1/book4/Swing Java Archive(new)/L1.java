import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class L1 extends JFrame{
	Container c;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	String s1,s2;
	L1(){
		c=getContentPane();
		c.setLayout(null);
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		t1=new JTextField(20);
		p1=new JPasswordField(20);
		p1.setEchoChar('*');
		b1=new JButton("Submit");
		b2=new JButton("Exit");
		l1.setBounds(100,100,80,30);
		t1.setBounds(200,100,80,30);
		l2.setBounds(100,150,80,30);
		p1.setBounds(200,150,80,30);
		b1.setBounds(100,200,80,30);
		b2.setBounds(200,200,80,30);
		c.add(l1);
		c.add(l2);
		c.add(t1);
		c.add(p1);
		c.add(b1);
		setResizable(false);
		c.add(b2);
		setSize(350,400);
		setTitle("LoginForm");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		B1 b1Obj=new B1();
		B2 b2Obj=new B2();
		b1.addActionListener(b1Obj);
		b2.addActionListener(b2Obj);
	}
	class B1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			try {s1=t1.getText();
			s2=p1.getText();
			if(s1.equals("kc") && s2.equals("abc123")){
				JOptionPane.showMessageDialog(c,"login Successful");
					t1.setText("");
					p1.setText("");
					t1.requestFocus();
			}
			else{
				if(t1.getText().length()==0 && p1.getText().length()==0){
					JOptionPane.showMessageDialog(c,"Enter username and password","acces denied ",JOptionPane.ERROR_MESSAGE);
					t1.setText("");
					p1.setText("");
					t1.requestFocus();
					return;
				}
					if(t1.getText().length()==0){
					JOptionPane.showMessageDialog(c," Enter Username","acces denied",JOptionPane.ERROR_MESSAGE);
					t1.setText("");
					p1.setText("");
					t1.requestFocus();
					return;
				}
				 if(p1.getText().length()==0){
					JOptionPane.showMessageDialog(c,"Enter password","acces denied ",JOptionPane.ERROR_MESSAGE);
					t1.setText("");
					p1.setText("");
					t1.requestFocus();
					return;
				}
				JOptionPane.showMessageDialog(c,"logon Denied! incorrect username or password ","login Unsuccessful",JOptionPane.ERROR_MESSAGE);
				t1.setText("");
				p1.setText("");
				t1.requestFocus();
			}
			}
			catch(Exception e){}		
		}
	}
	class B2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			System.exit(1);
		}
	}	
	public static void main(String args[]){
		L1 l=new L1();
	}
}