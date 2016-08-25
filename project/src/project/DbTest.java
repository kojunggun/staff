package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbTest {
	public static void main(String[] args) {
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String uid = "kedu";
	String pwd = "1234";
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,uid,pwd);
		String sql = "select * from member";
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		
			while(rs.next()){
				System.out.println(rs.getString("name"));
			}
			
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}	finally {
		try {
			if(rs != null){
				rs.close();
			}
			if( stmt != null){
				stmt.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
}
