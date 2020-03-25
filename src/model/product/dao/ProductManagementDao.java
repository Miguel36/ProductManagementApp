package model.product.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import infrastructure.dbutil.DBUtil;
import model.product.entity.Product;

public class ProductManagementDao {
	

	public static List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<Product>();
		
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Product");	
			while (resultSet.next()) {
				
				Product product = new Product(
						resultSet.getString("prod_id"),
						resultSet.getString("prod_name"),
						resultSet.getString("prod_category"),
						resultSet.getInt("prod_price")
				);
				productList.add(product);
			}
			DBUtil.closeConnection(connection);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
}
