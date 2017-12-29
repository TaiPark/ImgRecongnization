package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.UserInfo;
import util.DBAccess;

public class ValidateDao {
	public static UserInfo LoginValidate(String username, String password) {
		String sql = "select email from usr where email = ? and psw = ?";
		UserInfo user = new UserInfo();
		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) 
		{
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user.setUserEmail(rs.getString("email"));
			}
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
}
