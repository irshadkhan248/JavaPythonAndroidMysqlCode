import java.io.*;
import java.sql.*;
class Db2{
	public static void main(String args[]){
		Console c=System.console();
		while(true){
			int op=Integer.parseInt(c.readLine("1 add, 2 view ,3 exit : "));
			if(op==1){
				try{
		
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			int rno=Integer.parseInt(c.readLine("Enter rno:"));
			String name=c.readLine("Enter name:");
			String sql ="insert into stu_bor_july_2019 values(?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,rno);
			pst.setString(2,name);
			long rid=pst.executeUpdate();
			System.out.println(rid+" records inserted");
			
			conn.close();
					
		}catch(SQLException se){
			System.out.println("issue"+se);

			}
		}
		else if (op==2){
			try{
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			String sql="select *from stu_bor_july_2019";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				int rno =rs.getInt(1);
				String name=rs.getString(2);
				System.out.println(rno+"  "+name);
				
			}
			rs.close();
			conn.close();
			
			}catch(SQLException se){
				System.out.println("issue"+se);
			}
			
		}
		else if (op==3){
			break;
		}
		else{
			System.out.println("Invalid option");
		}
	}
}
}
