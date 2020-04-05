import java.sql.*;
class Oc10a{
	public static void main(String args[]){
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:xe","system","abc123");
		}
		catch(Exception e){}
	}
}