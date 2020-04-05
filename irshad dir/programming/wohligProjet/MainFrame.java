//package wohligProject1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*; 
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	JButton btnAddMF,btnViewMF,btnUpdateMF,btnDeleteMF;
	Container c;
	public MainFrame(){
		
		c=getContentPane();
		btnAddMF=new JButton("ADD");
		btnViewMF=new JButton("VIEW");
		btnUpdateMF=new JButton("UPDATE");
		btnDeleteMF=new JButton("DELETE");
		setLayout(new FlowLayout());
		add(btnAddMF);
		add(btnViewMF);
		add(btnUpdateMF);
		add(btnDeleteMF);
		
		setTitle(" STUDENT MANAGEMENT");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);	
		
		btnAddMF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				AddFrame AF=new AddFrame();
				dispose();
				AF.setVisible(true);
			}
		});
		btnUpdateMF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UpdateFrame UF=new UpdateFrame();
				dispose();
				UF.setVisible(true);
			}
		});
		btnDeleteMF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DeleteFrame DF=new DeleteFrame();
				dispose();
				DF.setVisible(true);
			}
		});
		btnViewMF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ViewData VD=new ViewData();
				dispose();
				VD.setVisible(true);
			}
		});
	
	}
	
	public static void main(String[] args) {
		MainFrame ObjMF=new MainFrame();
	}
}
