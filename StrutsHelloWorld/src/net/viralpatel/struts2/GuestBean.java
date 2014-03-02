package net.viralpatel.struts2;

public class GuestBean 
{
private String guest;
private String when;
private String message;


public GuestBean() {
	super();
}
public GuestBean(String guest, String when, String message) {
	super();
	this.guest = guest;
	this.when = when;
	this.message = message;
}
public String getGuest() {
	return guest;
}
public void setGuest(String guest) {
	this.guest = guest;
}
public String getWhen() {
	return when;
}
public void setWhen(String when) {
	this.when = when;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
