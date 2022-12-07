package pomconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMConcept1 
{
	@FindBy(id="email")
	private WebElement email_id;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="Login")
	private WebElement lgn_btn;
	
	public POMConcept1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void email(String user)
	{
		email_id.sendKeys(user);
	}
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void Loginbtn()
	{
		lgn_btn.click();
	}
}
