package p10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Sw12 extends JFrame{
	Container c;
	JRadioButton rb1,rb2,rb3,rb4;
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	ButtonGroup bg1,bg2;
	JButton b1;
	JPanel p1,p2,p3,p4;
	Sw12(){
		c=getContentPane();
		c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
		
		p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.setBorder(BorderFactory.createTitledBorder("Bread Types"));
		rb1=new JRadioButton("Wheat Bread(Rs 10.00)");
		rb2=new JRadioButton("MulitiGrain Bread(Rs 15.00)");
		bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		p1.add(rb1);
		p1.add(rb2);
		c.add(p1);
		
		p2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.setBorder(BorderFactory.createTitledBorder("Butter Types"));
		rb3=new JRadioButton("Amul Butter(Rs 10.00)");
		rb4=new JRadioButton("Peanut Butter(Rs 15.00)");
		bg2=new ButtonGroup();
		bg2.add(rb3);
		bg2.add(rb4);
		p2.add(rb3);
		p2.add(rb4);
		c.add(p2);
		
		p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.setBorder(BorderFactory.createTitledBorder("Ingredients"));
		cb1=new JCheckBox("Tomatoes(Rs 5.00)");
		cb2=new JCheckBox("Onion(Rs 5.00)");
		cb3=new JCheckBox("Cucumber(Rs 5.00)");
		cb4=new JCheckBox("Potatoes(Rs 5.00)");
		cb5=new JCheckBox("Bell Peppers(Rs 5.00)");
		p3.add(cb1);
		p3.add(cb2);
		p3.add(cb3);
		p3.add(cb4);
		p3.add(cb5);
		c.add(p3);
		
		
		p4=new JPanel();
		b1=new JButton("Submit");
		p4.add(b1);
		c.add(p4);
		L1 l1=new L1();
		b1.addActionListener(l1);
	}
	class L1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			double total=0;
			String order="";
			order+=" 1) ";
			if(rb1.isSelected()){order+=rb1.getText()+" "; 	total+=10.00; 	}
			if(rb2.isSelected()){order+=rb2.getText()+" "; 	total+=15.00; 	}
			order+=" 2) ";
			if(rb3.isSelected()){order+=rb3.getText()+" "; 	total+=10.00; 	}
			if(rb4.isSelected()){order+=rb4.getText()+" "; 	total+=15.00; 	}
			order+=" 3) ";
			if(cb1.isSelected()){order+=cb1.getText()+" "; 	total+=5.00; 	}
			if(cb2.isSelected()){order+=cb2.getText()+" "; 	total+=5.00; 	}
			if(cb3.isSelected()){order+=cb3.getText()+" "; 	total+=5.00; 	}
			if(cb4.isSelected()){order+=cb4.getText()+" "; 	total+=5.00; 	}
			if(cb5.isSelected()){order+=cb5.getText()+" "; 	total+=5.00; 	}
			JOptionPane.showMessageDialog(c,order+" Rs "+total);
		}
	}
	public static void main(String args[]){
		Sw12 sw=new Sw12();
		sw.setSize(350,400);
		sw.setTitle("Sandwich Order");
		sw.setLocationRelativeTo(null);
		sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sw.setVisible(true);
	}
}