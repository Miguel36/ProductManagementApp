package use_cases;

import com.opensymphony.xwork2.ActionSupport;

import model.product.dao.ProductManagementDao;

@SuppressWarnings("serial")
public class DeleteProduct extends ActionSupport {
	
	private String productId;
	
	public String execute() {
		String statusCode = "";
		int recordDeleted = ProductManagementDao.deleteProduct(productId);
		
		if (recordDeleted == 1) {
			statusCode = SUCCESS;
		}
		else {
			statusCode = ERROR;
		}
		return statusCode;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
