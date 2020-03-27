package model.interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import use_cases.LoginUser;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() called");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init() called");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		Object user = ServletActionContext.getRequest().getSession().getAttribute("loggedinUser");
		if (user == null) {
			if (actionInvocation.getAction().getClass().equals(LoginUser.class)) {
				return actionInvocation.invoke();
			}
			return "input";
		}
		return actionInvocation.invoke();
	}

}
