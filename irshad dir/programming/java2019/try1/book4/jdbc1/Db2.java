import java.sql.*;
class Db2{
	public static void main(String args[]){
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}