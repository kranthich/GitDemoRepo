import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLConnect {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		int port=3306;
		Connection con  = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port+ "/qadbt","root","root"); 
        Statement st = con.createStatement();
      ResultSet rs =  st.executeQuery("select * from credentials where scenario='Zeobalance'");
      String userName;
      String passWord; 
      while(rs.next()) {
    	   
    	    userName = rs.getString("UserName");
    	    passWord = rs.getString("Password");
    	   System.out.println(userName+ "********" +passWord );
       }
	}

}
