import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class BackgroundChange
{
	  public static void main(String[] arg)
		{
			  String color = "none";
			  final JFrame frame = new JFrame();
				final JLabel label = new JLabel(color);
			  final JButton button1 = new JButton("Red");
				final JButton button2 = new JButton("Blue");
				final JButton button3 = new JButton("Green");
				
				frame.getContentPane().add(button1);
				frame.getContentPane().add(button2);
				frame.getContentPane().add(button3);
				frame.getContentPane().add(label);
				label.setForeground(Color.BLACK);
				
				ActionListener a = new ActionListener()
				{
					  public void actionPerformed(ActionEvent e)
						{
							  label.setText("Red");
								frame.getContentPane().setBackground(Color.RED);
						}
				};
			  ActionListener b = new ActionListener()
				{
					  public void actionPerformed(ActionEvent e)
						{
							  label.setText("Blue");
								frame.getContentPane().setBackground(Color.BLUE);
						}
				};
				ActionListener c = new ActionListener()
				{
					  public void actionPerformed(ActionEvent e)
						{
							  label.setText("Green");
								frame.getContentPane().setBackground(Color.GREEN);
						}
				};
				button1.addActionListener(a);
				button2.addActionListener(b);
				button3.addActionListener(c);
				
				
				frame.getContentPane().setLayout(
					  new BoxLayout(
							  frame.getContentPane(),
								BoxLayout.Y_AXIS));
								
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
		
		}
}
