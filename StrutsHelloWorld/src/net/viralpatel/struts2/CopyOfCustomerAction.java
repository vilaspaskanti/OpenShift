package net.viralpatel.struts2;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class CopyOfCustomerAction extends ActionSupport
{
	private String username;
	private String message;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public String execute()
	{
		if(username=="vilas")
		{
		message="Hello,"+username;
		System.out.println("in if");
		return "success";
		}
		else
		{
			message="Invalid Username Access Denied to,"+username;
			System.out.println("in else");
			return "error";
		}
	}
	
}
