package net.viralpatel.struts2;

import java.util.Date;
import java.util.Vector;

import com.opensymphony.xwork2.ActionSupport;

public class GuestViewAction extends ActionSupport
{
	private String guest;
	private String message;
	private String para;
	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}
	private String when=new Date().toString();
	private static Vector<GuestBean> messages = new Vector<GuestBean>();
	
		public String execute()
	{
			System.out.println("Sleeping");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Done");
			System.out.println(getGuest()+getMessage()+getWhen());
			System.out.println("before for");
			messages.add(new GuestBean(getGuest(), getWhen(), getMessage()));
			/*for(Cookie c : req.getCookies())
			{
				System.out.println("Hidden value"+para);
				
				System.out.println("Inside for");
			    if (c.getName().equals("Cookie"))
			      System.out.println("Cookie value:"+c.getValue());
			}*/
			return SUCCESS;
	}

		public String getGuest() {
			return guest;
		}

		public void setGuest(String guest) {
			this.guest = guest;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getWhen() {
			return when;
		}

		public void setWhen(String when) {
			this.when = when;
		}

		public static Vector<GuestBean> getMessages() {
			return messages;
		}

		public static void setMessages(Vector<GuestBean> messages) {
			GuestViewAction.messages = messages;
		}
		/*@Override
		public void setServletResponse(HttpServletResponse res)
		{
			// TODO Auto-generated method stub
			this.res=res;
			
		}

		@Override
		public void setServletRequest(HttpServletRequest req) 
		{
			// TODO Auto-generated method stub
			this.req=req;
		}
*/	
	
		
}
