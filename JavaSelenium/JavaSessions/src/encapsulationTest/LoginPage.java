package encapsulationTest;

public class LoginPage 
{	
	private String username;
	private String psw;
	
	public void setUserName(String un)
	{
		this.username=un;
	}
	
	public void setPsw(String pp)
	{
		this.psw=pp;
		
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public String getPsw()
	{
		return psw;
	}
	//Business Logic/Method
	public void doLogin(String un,String psw)
	{
		System.out.println("Login with "+un+" : "+psw);
	}

}
