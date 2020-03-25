package use_cases;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import model.product.dao.ProductManagementDao;
import model.product.entity.Product;

@SuppressWarnings("serial")
public class WelcomeAction extends ActionSupport {
	
	private List<Product> products;
	
	
	public void initializeProducts() {
		products = ProductManagementDao.getAllProducts();
	}
	
	public String execute() {
		initializeProducts();
		return SUCCESS;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
