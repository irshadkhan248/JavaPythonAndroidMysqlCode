import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class DeleteFrame extends JFrame
{
	Container c;
	JLabel lblrno;
	JTextField jtfrno;
	JButton btnDelete,btnBack,btnLogout;
	DeleteFrame()
	{
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290,400);
		setVisible(true);

		btnDelete = new JButton("Delete");
		btnBack = new JButton("Back");
		btnLogout = new JButton("Logout");
		jtfrno = new JTextField(20);
		lblrno = new JLabel("Roll ");
		c.add(lblrno);
		c.add(jtfrno);
		c.add(btnDelete);
		c.add(btnBack);
		c.add(btnLogout);

		ActionListener a3 = (ae)->{
			if(jtfrno.getText().length()==0)
			{
				JOptionPane.showMessageDialog(c,"Roll Number Cannot be Empty");
				jtfrno.setText("");
				jtfrno.requestFocus();
				return;
			}
			try
			{
				int srno = Integer.parseInt(jtfrno.getText());
				if(srno<=0)
				{
					JOptionPane.showMessageDialog(c,"Roll Number Cannot be Negative");
					jtfrno.setText("");
					jtfrno.requestFocus();
					return;
				}
				DBHandler db = new DBHandler();
				db.delete(srno);
				jtfrno.setText("");
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(c,"Only Integers Allowed");
			}
			catch(Exception e)
			{
			}
		};
		btnDelete.addActionListener(a3);


		ActionListener a1 = (ae)->{
			jtfrno.setText("");
			dispose();
			MainFrame m = new MainFrame();
		};
		btnBack.addActionListener(a1);
		
		ActionListener a2 = (ae)->{
			jtfrno.setText("");
			dispose();
			LoginFrame m = new LoginFrame();
		};
		btnLogout.addActionListener(a2);
	}
}