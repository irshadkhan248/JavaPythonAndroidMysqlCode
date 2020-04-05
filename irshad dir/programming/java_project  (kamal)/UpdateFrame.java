import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class UpdateFrame extends JFrame
{
	Container c;
	JButton btnUpdate,btnBack,btnLogout;
	JLabel lblrno,lblname,lblmarks;
	JTextField jtfrno,jtfname,jtfmarks;
	UpdateFrame()
	{
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290,400);
		setVisible(true);
		
		btnUpdate = new JButton("Update");
		btnBack = new JButton("Back");
		btnLogout = new JButton("Log Out");

		lblrno = new JLabel("Roll ");
		lblname = new JLabel("Name ");
		lblmarks = new JLabel("Marks ");

		jtfrno = new JTextField(20);
		jtfname = new JTextField(20);
		jtfmarks = new JTextField(20);

		c.add(lblrno);
		c.add(jtfrno);
		c.add(lblname);
		c.add(jtfname);
		c.add(lblmarks);
		c.add(jtfmarks);
		c.add(btnUpdate);
		c.add(btnBack);
		c.add(btnLogout);

		ActionListener a1 = (ae)->{
			jtfrno.setText("");
			jtfname.setText("");
			jtfmarks.setText("");
			dispose();
			MainFrame m = new MainFrame();
		};
		btnBack.addActionListener(a1);

		ActionListener a2 = (ae)->{
			jtfrno.setText("");
			jtfname.setText("");
			jtfmarks.setText("");
			dispose();
			LoginFrame m = new LoginFrame();
		};
		btnLogout.addActionListener(a2);

		ActionListener a3 = (ae)->{
			String r = jtfrno.getText();
			int srno;
			if(r.length()==0)
			{
				JOptionPane.showMessageDialog(c,"Roll Number Field Cannot be Empty");
				jtfrno.requestFocus();
				return;
			}
			else
			{
				try
				{
					srno = Integer.parseInt(r);					
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(c,"Only Integers Allowed in the Field");
					jtfrno.setText("");
					jtfrno.requestFocus();
					return;	
				}
			}
			if(srno<=0)
			{
				JOptionPane.showMessageDialog(c,"Roll Number Cannot be Negative");
				jtfrno.setText("");
				jtfrno.requestFocus();
				return;
			}
			String sname = jtfname.getText();
			if(sname.length()==0)
			{
				JOptionPane.showMessageDialog(c,"Name Cannot be Empty");
				return;
			}
			else
			{
				char[] checker = sname.toCharArray();
				for (char abc:checker)
				{
					if (Character.isLetter(abc))
					{
						continue;
					}
					else
					{
						JOptionPane.showMessageDialog(c,"Only Alphabets Allowed in this Field");
						jtfname.setText("");
						jtfname.requestFocus();
						return;
					}
				}
			}
			String m = jtfmarks.getText();
			int smarks;
			if (m.length()==0)
			{
				JOptionPane.showMessageDialog(c,"Name Cannot be Empty");
				return;
			}
			else
			{
				try
				{
					smarks = Integer.parseInt(m);	
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(c,"Only Integers Allowed in this Field");
					jtfmarks.setText("");
					jtfmarks.requestFocus();
					return;
				}
			}
			if (smarks<0 || smarks>100)
			{
				JOptionPane.showMessageDialog(c,"Invalid Marks");
				jtfmarks.setText("");
				jtfmarks.requestFocus();
				return;
			}
			try
			{
				SimpleAudioPlayer s = new SimpleAudioPlayer("alert3.wav");	
			}
			catch (Exception e)
			{

			}
			DBHandler db = new DBHandler();
			db.update(srno,sname,smarks);
			jtfrno.setText("");
			jtfname.setText("");
			jtfmarks.setText("");
		};
		btnUpdate.addActionListener(a3);

		setVisible(true);
	}
}