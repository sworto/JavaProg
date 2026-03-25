import java.sql.*;
class testprogram{
	public static void main(String[] args) throws SQLException{
			//Connection String:
			String url= new String("jdbc:mysql://localhost:3306/SWORTODB");
			Connection conn= DriverManager.getConnection(url,"sworto","9737276647");
			System.out.println("Connection Sucessful");

			//TableCreation
			/*Statement stmt= conn.createStatement();
			stmt.executeUpdate("CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50),age INT);");
			System.out.println("Table Created");*/

			//PreparedStatement
			//PreparedStatement ps= conn.prepareStatement("INSERT INTO users(id,name,age) VALUES(?,?,?)");
			/*ps.setInt(1,1);
			ps.setString(2,"NAME1");
			ps.setInt(3,3);
			ps.executeUpdate();*/

			//Preparedstatement2
			PreparedStatement ps= conn.prepareStatement("SELECT * FROM users");
			ResultSet rs= ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
			}
			System.out.println("Executed Successfully");
			conn.close();
			return;
	}
}