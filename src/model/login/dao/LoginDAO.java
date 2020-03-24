package model.login.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import infrastructure.dbutil.DBUtil;
import model.login.entity.LoginInfo;

public class LoginDAO {

	public static boolean isUserValid(LoginInfo userDetails) {
		
		boolean validStatus = false;
		
		try {
			
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(
					"SELECT * FROM logininfo WHERE user_name = '"
					+userDetails.getUserName()
					+"' AND password = '"+
					userDetails.getPassword()+"'"
			);				
			while (resultSet.next()) {
				
				validStatus = true;
			}
			
			DBUtil.closeConnection(connection);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return validStatus;
	}
}
