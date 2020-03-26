package model.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	
	public static Product getProductById(String productId) {
		Product product = null;
		
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement pStatement = connection.prepareStatement("SELECT * FROM Product WHERE prod_id = ?");
			pStatement.setString(1, productId);
			ResultSet resultSet = pStatement.executeQuery();
			
			while (resultSet.next()) {
				product = new Product(
						resultSet.getString("prod_id"),
						resultSet.getString("prod_name"),
						resultSet.getString("prod_category"),
						resultSet.getInt("prod_price")
				);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	
	
	public static int addProduct(Product product) {
		int status = 0;
		
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement pStatement = connection.prepareStatement("INSERT INTO Product VALUES (?, ?, ?, ?)");
			pStatement.setString(1, product.getProductId());
			pStatement.setString(2, product.getProductName());
			pStatement.setString(3, product.getProductCategory());
			pStatement.setInt(4, product.getProductPrice());
			status = pStatement.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	public static int updateProduct(Product product) {
		int status = 0;
		
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement pStatement = connection.prepareStatement(
					"UPDATE Product SET prod_name = ?,"
					+ " prod_category = ?,"
					+ " prod_price = ?"
					+ " WHERE prod_id = ?"
			);
			pStatement.setString(1, product.getProductName());
			pStatement.setString(2, product.getProductCategory());
			pStatement.setInt(3, product.getProductPrice());
			pStatement.setString(4, product.getProductId());
			
			status = pStatement.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
}
