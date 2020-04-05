import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
class AddFrame extends JFrame
{
	Container c;
	JButton btnInsert,btnBack,btnLogout;
	JLabel lblrno,lblname,lblmarks;
	JTextField jtfrno,jtfname,jtfmarks;
	AddFrame()
	{
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290,400);
		setVisible(true);
		
		btnInsert = new JButton("Insert");
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
		c.add(btnInsert);
		c.add(btnBack);
		c.add(btnLogout);

		
		

		ActionListener a1 = (ae)->{
			dispose();
			MainFrame m = new MainFrame();			
		};
		btnBack.addActionListener(a1);

		ActionListener a2 = (ae)->{
			dispose();
			LoginFrame m = new LoginFrame();
		};
		btnLogout.addActionListener(a2);

		ActionListener a3 = (ae)->{
			try
			{
				String r = jtfrno.getText();
				String sname = jtfname.getText();
				String m = jtfmarks.getText();
				int srno = Integer.parseInt(r);
				char[] checker = sname.toCharArray();
				if(sname.length()<5){JOptionPane.showMessageDialog(c,"insert valid name");
					jtfname.setText("");
					jtfname.requestFocus();
					return;}
				if(srno<0)
				{
					JOptionPane.showMessageDialog(c,"Roll Number cannot be Negative");
					jtfrno.setText("");
					jtfrno.requestFocus();
					return;
				}
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
				if (r.equals("") || sname.equals("") || m.equals(""))
				{
					throw new IOException();
				}
				else if(srno>123456789){}
				else
				{
					srno = Integer.parseInt(r);
					int smarks = Integer.parseInt(m);
					Student s = new Student();
					s.setSrno(srno);
					s.setSname(sname);
					s.setSmarks(smarks);
					if(smarks<0 || smarks>100)
					{
						throw new SQLException();
					}
					DBHandler db = new DBHandler();
					db.insert(s);
				}
			}
			catch (IOException e)
			{
				JOptionPane.showMessageDialog(c,"Fields cannot be Empty");
				return;
			}
			catch(SQLException e)
			{
				JOptionPane.showMessageDialog(c,"Invalid Marks");
				jtfmarks.setText("");
				jtfmarks.requestFocus();
				return;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(new JDialog(),"Only Integers Expected");
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(c,"You Cannot Enter Digits and ");
			}
		jtfrno.setText("");
		jtfname.setText("");
		jtfmarks.setText("");
		};
		btnInsert.addActionListener(a3);

		setVisible(true);
	}
}