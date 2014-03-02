package net.viralpatel.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport 
{
private String message;
private String username;

		public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String execute()
{	
	
	if(this.username=="vilas")
		return "success";
	else
	{	addActionError(getText("error.login"));
		return "success";
	}
}
}
