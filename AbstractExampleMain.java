/**
 * 
 */
package basic.abstractInterface;

/**
 * @author welcome
 *
 */
public class AbstractExampleMain extends AbstractExample{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		AbstractExampleMain abstractExampleMain = new AbstractExampleMain();
		LoginDetails loginDetails=abstractExampleMain.setLoginDetails();
		abstractExampleMain.loginDetails(loginDetails);
		abstractExampleMain.displayDetails();
		
	}
   private LoginDetails setLoginDetails(){
	   LoginDetails loginDetails = new LoginDetails();
	   loginDetails.setUserName("MadhuTechnology");
	   loginDetails.setPassword("abc");
	   return loginDetails;
   }
   
	@Override
	public void displayDetails() {
		System.out.println("Company registered in year :::2012");
		System.out.println("Company registered in place:: : Hyderabad");
		System.out.println("Company Main Branch::: Warangal");
	}
	public void loginDetails(LoginDetails loginDetails){
		System.out.println("Main userName is :::" +loginDetails.getUserName() );
		System.out.println("Main password is :::" +loginDetails.getPassword() );
		 
	 }
}
