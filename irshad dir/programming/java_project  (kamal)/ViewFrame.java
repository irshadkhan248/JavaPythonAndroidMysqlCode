import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ViewFrame extends JFrame
{
	Container c;
	JButton btnBack,btnLogout;
	TextArea taData;
	ViewFrame()
	{
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290,400);
		taData = new TextArea(5,30);
		btnBack = new JButton("Back");
		btnLogout = new JButton("Logout");
		c.add(taData);
		c.add(btnBack);
		c.add(btnLogout);
		DBHandler db = new DBHandler();
		taData.setText(db.view());
		taData.setEditable(false);
		taData.setFocusable(false);

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
		setVisible(true);
	}
}