import java.sql.*;

class Oc10ba11{

	public static void main(String args[]){
	
		try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
		PreparedStatement stmt=conn.prepareStatement(insert into tab2 values(?,?));
		long t1=System.currentTimeMillis();
		for(int i=1;i<=1000;i++){
		stmt.setInt(1,i);
		stmt.setInt(2,i*10);
		stmt.executeUpdate();
		}
		long t2=System.currentTimeMillis();
		System.out.println("Time= "+(t2-t1));
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}	
}		