package use_cases;

import com.opensymphony.xwork2.ActionSupport;
import model.login.dao.LoginDAO;
import model.login.entity.LoginInfo;

@SuppressWarnings("serial")
public class LoginUser extends ActionSupport {
	
	private String userName;
	private String password;
	

	public String execute() {
		String statusCode = "";
		boolean isUserValid = LoginDAO.isUserValid(new LoginInfo(userName, password));
		
		if (isUserValid) {
			statusCode = SUCCESS;
		}
		else {
			statusCode = INPUT;
		}
		return statusCode;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
