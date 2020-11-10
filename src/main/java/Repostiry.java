

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repostiry {
	WebDriverWait wait;
	
	
	WebDriver driver;

    @FindBy(xpath="//a[@href='/login/loggedIn']")

    WebElement signup;

    @FindBy(id="ids_overlay_container")

    WebElement register;    

    @FindBy(xpath="//input[@name='firstName']")

    WebElement firstName;

    @FindBy(xpath="//input[@name='lastName']")

    WebElement lastName;
    @FindBy(xpath="//input[@name='mail']")

    WebElement mail;
    @FindBy(xpath="//input[@name='password']")

    WebElement password;
    
    
    @FindBy(xpath="//input[@name='passwordConfirm']")

    WebElement passwordConfirm;
    
    
    
    @FindBy(name="pdAccept")

    WebElement acceptcheck;
    
    @FindBy(xpath="//*[@name='touAccept']")

    WebElement acceptcheck2;
    @FindBy(xpath="//*[@type='submit']")

    WebElement submit;
    
    
    

    public Repostiry(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    public void setUp(){

        signup.click();;     
    }
public void explicitWait(String id) {
wait=new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	
	
}
public void explicitWait2(String name) {
wait=new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(name)));
	
	
}
public void explicitWait1(String name) {
wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
}
public void setfirstname(String first){

	firstName.sendKeys(first); 
}

public void setlastname(String lastname){

	lastName.sendKeys(lastname); 

}
public void setEmail(String email){

	mail.sendKeys(email); 
}
public void setPwd(String pwd1){

	password.sendKeys(pwd1); 
}
public void setpwd1(String pwd2){

	passwordConfirm.sendKeys(pwd2); 
}
public void setcheck(){

	acceptcheck.click();
}
public void setCheck2(){

	acceptcheck2.click(); 
}
public void setCreated(){

	submit.click(); 
}
public void frame() {
	register.click();
}
}