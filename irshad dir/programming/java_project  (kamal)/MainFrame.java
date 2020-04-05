import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MainFrame extends JFrame
{
	Container c;
	JButton btnAdd,btnView,btnUpdate,btnDelete,btnLogout;
	MainFrame()
	{
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290,400);
		btnAdd = new JButton("Add");
		btnView = new JButton("View");
		btnUpdate = new JButton("Update");
		btnDelete = new JButton("Delete");
		btnLogout = new JButton("Logout");
		c.add(btnAdd);
		c.add(btnView);
		c.add(btnUpdate);
		c.add(btnDelete);
		c.add(btnLogout);
		setVisible(true);

		ActionListener a1 = (ae)->{
			dispose();
			AddFrame a = new AddFrame();
		};
		btnAdd.addActionListener(a1);

		
		ActionListener a2 = (ae)->{
			ViewFrame a = new ViewFrame();
			dispose();
		};
		btnView.addActionListener(a2);

		
		ActionListener a3 = (ae)->{
			UpdateFrame a = new UpdateFrame();
			dispose();
		};
		btnUpdate.addActionListener(a3);

		
		ActionListener a4 = (ae)->{
			DeleteFrame a = new DeleteFrame();
			dispose();
		};
		btnDelete.addActionListener(a4);

		
		ActionListener a5 = (ae)->{
			LoginFrame a = new LoginFrame();
			dispose();
		};
		btnLogout.addActionListener(a5);
	}
}