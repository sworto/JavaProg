import java.sql.*;
class test2{
	public static void main(String[] args)throws SQLException{
		String url= "jdbc:mysql://localhost:3306/SWORTODB";
		Connection conn= DriverManager.getConnection(url,"sworto","9737276647");
		PreparedStatement stmt= conn.prepareStatement("SELECT * FROM users WHERE id=?");
		stmt.setInt(1,1);
		ResultSet rs= stmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("id")+" "+rs.getString("name"));
		}
	}
}