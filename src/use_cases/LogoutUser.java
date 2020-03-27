package use_cases;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LogoutUser extends ActionSupport {
	
	public String execute() {
		ServletActionContext.getRequest().getSession().invalidate();
		return INPUT;
	}

}
