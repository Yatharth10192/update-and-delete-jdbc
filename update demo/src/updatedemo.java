import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class updatedemo {
	public static void main(String [] args) throws SQLException, ClassNotFoundException {
	 String city1 = "bahadurgarh";
	 String email1 = "yatharth123@gmail.com";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "Yatharth@10192");
		PreparedStatement ps = con.prepareStatement("update register set city=? where email = ?");
		ps.setString(1, city1);
		ps.setString(2, email1);
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			System.out.println("updated successfully!");
		}
		else {
			System.out.println("updation failed");
		}
	}

}
