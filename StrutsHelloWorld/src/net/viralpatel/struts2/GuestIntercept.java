package net.viralpatel.struts2;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class GuestIntercept implements Interceptor
{
	private long starttime;
	private long endtime;
	@Override
	public void destroy() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation next) throws Exception {
		// TODO Auto-generated method stub
		starttime=System.currentTimeMillis();
		next.invoke();
		endtime=System.currentTimeMillis();
		System.out.println("The Time Taken for the Action"+next.getAction().getClass().getName()+"is"+(starttime-endtime)+"miliseconds");
		return "success";
	}

}
