package encapsulationTest;

public class TestLoginPage {

	public static void main(String[] args)
	{
			LoginPage lp=new LoginPage();
			lp.setUserName("Tester1@gmail.com");
			lp.setPsw("Tester1");

			lp.doLogin(lp.getUserName(), lp.getPsw());
			
			
			lp.setUserName("Sujay@gmail.com");
			lp.setPsw("Sujay");
			lp.doLogin(lp.getUserName(),lp.getPsw());
	}

}
