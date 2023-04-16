import java.sql.*;

// Creating Connection


public class JDBC_Tutorial {
	
	public static void main(String[]arge) {
		Connection con = null;
		try {
// Step 1. Load Driver
		   Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
// step 2. Create Connection
			String url = "jdbc:mysql://localhost:3306/java";  // localhost ki jagha ip address likhna jab remote server pe database ho
			String username = "root";
			String password = "root";
			
			
			con = DriverManager.getConnection(url,username,password);
			
			if(con.isClosed()) {
				System.out.println("Connection is closed");
			}else {
				System.out.println("Connection Created...");
			}
			
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
