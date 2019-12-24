package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureC {
	WebDriver driver;
//	
	@Given("application is lauched by user")
	public void application_is_lauched_by_user() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@Given("user verifies the DemoWebShop website")
	public void user_verifies_the_DemoWebShop_website() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		Assert.assertEquals(driver.getTitle(), "Home");
	}

	@Given("user clicks on SignUp button")
	public void user_clicks_on_SignUp_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters proper information")
	public void user_enters_proper_information() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("NamrataS");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Namrata");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("S");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass123");
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("pass123");
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("n@s.com");
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("1234567889");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("22/12/2000");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("asdfghjklpoiuytreewqzxcvbnm");
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("abcdefg");
	}

	@Then("clicks on submit button for Registration button")
	public void clicks_on_submit_button_for_Registration_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@Then("clikcs on logout and close the browser")
	public void clikcs_on_logout_and_close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.close();
	}

	@Given("registered user clicks on Login link")
	public void registered_user_clicks_on_Login_link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("he provides valid username {string}")
	public void he_provides_valid_username(String string) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@Then("provides valid password {string}")
	public void provides_valid_password(String string1) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string1);
	}

	@Then("verifies Login status")
	public void verifies_Login_status() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
		driver.close();
	}

	@Given("user types which item he want to buy")
	public void user_types_which_item_he_want_to_buy() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();

		// act.keyDown(searchbx, Keys.SHIFT).perform();

	//	WebElement searchbx=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		//act.moveToElement(searchbx).click();
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
		act.sendKeys("h").pause(3000).sendKeys("e").pause(3000).sendKeys("a").sendKeys("d").pause(3000).perform();
		//driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("head");
		//Thread.sleep(1000);
	}

	@Then("selects the product from options")
	public void selects_the_product_from_options() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	//	WebElement headp=driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"));
		//act.moveToElement(headp).click();
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
	}

	@Then("clicks on search button")
	public void clicks_on_search_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("the item which user selected is displayed")
	public void the_item_which_user_selected_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		Assert.assertEquals(driver.getTitle(),"Search");
		driver.close();
	}
	
	
	@Given("user does login")
	public void user_does_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("snehalg");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("user searches the item he want to buy")
	public void user_searches_the_item_he_want_to_buy() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
		act.sendKeys("h").pause(3000).sendKeys("e").pause(3000).sendKeys("a").sendKeys("d").pause(3000).perform();
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
	}

	@Then("user is unable to proceed further")
	public void user_is_unable_to_proceed_further() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		WebElement cart= driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
		Assert.assertNotEquals(driver.getTitle(), cart);
	}



}
