import java.sql.*;
class Db1{
	public static void main(String args[]){
		try{
			System.out.println("trying to load the driver ");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			System.out.println("Driver  Loaded");
			System.out.println("trying to connect ");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			System.out.println("connected");
			System.out.println("trying to close ");
			conn.close();
			System.out.println("connection closed");
			
		}catch(SQLException se){
			System.out.println("issue"+se);
			
		}//end of catch
	}//end of main
}//end of class