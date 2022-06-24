// The following program will automate the process of creating a lead with the provided data below on the "Leaftaps" site
// The following program is to Create Lead in "leaftaps" site.
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
// Setting up chrome driver
		WebDriverManager.chromedriver().setup();
// Launching Chrome Browser
		ChromeDriver driver=new ChromeDriver();
// Maximizing the browser window
		driver.manage().window().maximize();
// Launching the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
// Finding Username element by Id
		WebElement usernameElement = driver.findElement(By.id("username"));
// Typing username using sendkeys
		usernameElement.sendKeys("Demosalesmanager");
// Finding Password element by Id and typing password using send keys
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
// Finding Login button element using classname and click on login
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
// Finding CRM/SFA element using link text and click on it
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
// Finding Leads button using link text and click on it
		WebElement leadsButton = driver.findElement(By.linkText("Leads"));
		leadsButton.click();
// Finding create lead button using text link and click on it
		WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
		createLeadButton.click();
// Finding company name, first name, last name, first_name_local elements by id and entering values using sendkeys
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Siva");
		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys("S");
		WebElement fnameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fnameLocalElement.sendKeys("Siva");
// Finding department name element, description element and entering values using sendkeys		
		WebElement departmentNameElement = driver.findElement(By.name("departmentName"));
		departmentNameElement.sendKeys("Software Testing");
		WebElement descriptionElement = driver.findElement(By.name("description"));
		descriptionElement.sendKeys("Testing Create Lead using Selenium");
// Finding emailElement using id and entering values using sendkeys
		WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("Siva@testleaf.com");
// Finding stateProvinceElement using name and select "New York" using visible text
		WebElement stateProvinceElement = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateProvince = new Select(stateProvinceElement);
		stateProvince.selectByVisibleText("New York");
// Finding submitButton using class name and click on it.
		WebElement submitButton = driver.findElement(By.className("smallSubmit"));
		submitButton.click();
// Getting title
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
