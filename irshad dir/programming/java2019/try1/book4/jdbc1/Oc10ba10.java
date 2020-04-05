import java.sql.*;

class Oc10ba10{

	public static void main(String args[]){
	
		try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
		Statement stmt=conn.createStatement();
		long t1=System.currentTimeMillis();
		for(int i=1;i<=1000;i++){
		stmt.executeUpdate("insert into TAB1 values(" +i + ","+i*10+")");
		}
		long t2=System.currentTimeMillis();
		System.out.println("Time= "+(t2-t1));
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}	
}		