package model.product.entity;

public class Product {
	
	private String productId;
	private String productName;
	private String productCategory;
	private Integer productPrice;
	
	public Product() {
		
	}
	
	public Product(String productId, String productName, String ProductCategory, Integer productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = ProductCategory;
		this.productPrice = productPrice;
	}	
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

}
