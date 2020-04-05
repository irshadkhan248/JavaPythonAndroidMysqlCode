import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;


class C extends JFrame{
Container c;
JLabel lblNumber;
JTextField txtNumber;
JButton btnConvert;

C(){
c=getContentPane();
c.setLayout(new FlowLayout());
lblNumber=new JLabel("Enter Amount");
txtNumber=new JTextField(10);
btnConvert=new JButton("Convert");
c.add(lblNumber);
c.add(txtNumber);
c.add(btnConvert);
ActionListener a1=(ae)->{
	NumberFormat nfAmerica=NumberFormat.getCurrencyInstance(new Locale("en","US"));
	NumberFormat nfIndia=NumberFormat.getCurrencyInstance(new Locale("hi","IN"));
	double dollar=Double.parseDouble(txtNumber.getText());
	double rupees =dollar*68.4;
	String msg=nfAmerica.format(dollar)+" = "+nfIndia.format(rupees);
	JOptionPane.showMessageDialog(c,msg);
	
};
btnConvert.addActionListener(a1);

setTitle("Currency Converter ");
setSize(300,300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String args[]){
C c=new C();

}
}