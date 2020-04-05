import java.awt.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.sql.*;
class LoginFrame extends JFrame
{
	JTextField jtfuname,jtfemail;
	JPasswordField jpfpasswd;
	JLabel lbluname,lblpasswd,lblemail;
	JButton btnLogin,btnSignup,btnForgotPassword;
	Container c;
	LoginFrame()
	{
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290,400);
		lbluname = new JLabel("Username");
		lblpasswd = new JLabel("Password");
		lblemail = new JLabel("Email");
		jtfuname = new JTextField(20);
		jtfemail = new JTextField(20);
		jpfpasswd = new JPasswordField(20);
		jpfpasswd.setEchoChar('*');
		btnLogin = new JButton("Login");
		btnSignup = new JButton("Signup");
		btnForgotPassword = new JButton("Forgot Password");
		c.add(lbluname);
		c.add(jtfuname);
		c.add(lblpasswd);
		c.add(jpfpasswd);
		//c.add(lblemail);
		//c.add(jtfemail);
		c.add(btnLogin);
		c.add(btnSignup);
		c.add(btnForgotPassword);
		setVisible(true);
		//t = new ArrayList<>();
		
		ActionListener a1 = (ae)->{
			String uname = jtfuname.getText();
			String pass = jpfpasswd.getText();
			if(uname.equals("system") && pass.equals("abc123"))
			{
				try
				{
					SimpleAudioPlayer s = new SimpleAudioPlayer("Success_.wav");	
				}
				catch (Exception e)
				{

				}
				JOptionPane.showMessageDialog(c,"You are now Logged in");
				dispose();
				MainFrame i = new MainFrame();
				jtfuname.setText("");
				jpfpasswd.setText("");
				jtfuname.requestFocus();
			}
			else
			{
				jtfuname.setText("");
				jpfpasswd.setText("");
				jtfuname.requestFocus();
				JOptionPane.showMessageDialog(c,"Invalid Username or Password");
			}
		};
		btnLogin.addActionListener(a1);
		/*ActionListener a2 = (ae)->{
			dispose();
			SignupFrame s = new SignupFrame();
		};
		btnSignup.addActionListener(a2);
		ActionListener a3 = (ae)->{
			dispose();
			ForgotPassword s = new ForgotPassword();
		};
		btnForgotPassword.addActionListener(a3);
	*/
	}
	public static void main(String args[])
	{
		new LoginFrame();
	}
}
class DBHandler
{
	boolean flag = false;
	public boolean checkLogin(String username,String password)
	{
		
		Connection conn = null;
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			String sql = "select * from from teachers where username = ? and password = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			ResultSet rs = pstmt.executeQuery(sql);
			if(rs!=null)
			{
				while (rs.next())
				{
					String uname = rs.getString(1);
					String passwd = rs.getString(2);
					String email = rs.getString(3);
					if(uname.equals(username) && passwd.equals(password))
					{
						flag = true;
					}
					else
					{
						flag = false;
					}
				}
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(new JDialog(),e);
		}
		return flag;
	}
	public void insert(Student s)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=null ;
		Transaction t=null;
	
		try
		{
			session = factory.openSession();
			t = session.beginTransaction();
			session.save(s);
			t.commit();
			JOptionPane.showMessageDialog(new JDialog(),"Record Inserted");
		}
		catch (Exception ee)
		{
			t.rollback();
			JOptionPane.showMessageDialog(new JDialog(),"Issue "+ee);
		}
		finally
		{
			session.close();
		}
	}

	public String view()
	{
		StringBuffer sb = new StringBuffer();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;
		try{
			session = factory.openSession();
			//t = s.beginTransaction();
			java.util.List<Student> e = new java.util.ArrayList<>();
			e = session.createQuery("from Student").list();
			for(Student m:e){
				sb.append("Roll Number "+m.getSrno()+" Name "+m.getSname()+" Marks "+m.getSmarks()+"\n");
			}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(new JDialog(),"Issue = "+e);
		}
		finally{
			session.close();
		}
		return sb.toString();
	}

	public void update(int sturno,String stuname,int stumarks)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;
		Transaction t = null;
		try
		{
			session = factory.openSession();
			t = session.beginTransaction();
			int srno = sturno;
			Student s = (Student)session.get(Student.class,srno);
			if(s!=null)
			{
				String sname = stuname;
				int smarks = stumarks;
				s.setSname(stuname);
				s.setSmarks(stumarks);
				session.save(s);
				t.commit();
				JOptionPane.showMessageDialog(new JDialog(),"Record Updated");
			}
			else
			{
				JOptionPane.showMessageDialog(new JDialog(),"No Record Exists of Roll Number "+sturno);
			}
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(new JDialog(),"Issue "+e);
			t.rollback();
		}
		finally
		{
			session.close();
		}
	}
	public void delete(int sturno)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;
		Transaction t = null;
		try
		{
			session = factory.openSession();
			t = session.beginTransaction();
			Student s = (Student)session.get(Student.class,sturno);
			if(s!=null)
			{
				session.delete(s);
				t.commit();
				JOptionPane.showMessageDialog(new JDialog(),"Record Deleted");
				try
			{
				SimpleAudioPlayer sipcna = new SimpleAudioPlayer("alert3.wav");
			}
			catch (Exception e)
			{

			}

			}
			else
			{
				JOptionPane.showMessageDialog(new JDialog(),"No Record Exists of Roll Number "+sturno);
			}
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(new JDialog(),"Issue "+e);
		}
	}
}
class SimpleAudioPlayer
{
	public SimpleAudioPlayer(String filePath) throws Exception
	{
		AudioInputStream ais = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

		Clip clip = AudioSystem.getClip();

		clip.open(ais);

		clip.start();
	}
}
















