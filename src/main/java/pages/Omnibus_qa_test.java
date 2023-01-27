package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Omnibus_qa_test extends BasePageObject {
	/**
	 * URL
	 */
	private String pageUrl = "https://audiomovers.com/wp/omnibus-qa-test/";

	/**
	 * cookies
	 */
	private By DeclineCookiesbutton = By.className("evidon-banner-declinebutton");

	/**
	 * Top Menu
	 */
	private By LogoButton = By.className("custom-logo");
	private By LoginButton = By.xpath("//ul[@id='menu-menu']//a[@href='/wp/login']");
	private By ProductsButton = By.xpath("//*[@id=\"menu-menu\"]/li[1]/a");
	private By NewsButton = By.xpath("//*[@id=\"menu-menu\"]/li[6]/a");
	private By AboutButton = By.xpath("//*[@id=\"menu-menu\"]/li[5]/a");
	private By HelpButton = By.xpath("//*[@id=\"menu-menu\"]/li[4]/a");
	private By DownloadsButton = By.xpath("//*[@id=\"menu-menu\"]/li[3]/a");
	private By PrisingButton = By.xpath("//*[@id=\"menu-menu\"]/li[2]/a");

//	private WebElement Products = driver.findElement(By.name("Products"));
//private By ListenToButton = By.xpath("//*[@id=\"menu-menu\"]/li[1]/ul/li[1]/a");

	/**
	 * Bottom Menu
	 */
	public Omnibus_qa_test(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void cookieCleaner() {
		waitForVisibilityOf(DeclineCookiesbutton, 3);
		click(DeclineCookiesbutton);
	}

	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	public void clickLogoButton() {
		log.info("clicking Logo button");
		click(LogoButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}

	public void clickLoginButton() {
		log.info("clicking Login button");
		click(LoginButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}

	public void clickProductsButton() {
		log.info("clicking Products button");
		click(ProductsButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}

	public void clickNewsButton() {
		log.info("clicking News button");
		click(NewsButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}

	public void clickAboutButton() {
		log.info("clicking About button");
		click(AboutButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}

	public void clickHelpButton() {
		log.info("clicking Help button");
		click(HelpButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}

	public void clickDownloadsButton() {
		log.info("clicking Downloads button");
		click(DownloadsButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}

	public void clickPrisingButton() {
		log.info("clicking Prising button");
		click(PrisingButton);
		log.info("Page opened! Current URL is: " + driver.getCurrentUrl());
	}


//	public void clickListentoButton(){
//		waitForVisibilityOf((By) Products);
//		log.info("clicking Listento button");
//		hoverOverElement(Products);
//		waitForVisibilityOf(ListenToButton);
//		click(ListenToButton);
//	}


	/**
	 * Support section
	 */
//	private By SupportButton = By.xpath("//*[@id=\"Embed\"]/div/div/button");
//	private By NameInputField = By.xpath("//*[@id=\"1val-field_1.3.10--input\"]");
//	private By EmailInputField = By.xpath("//*[@id=\"2val-field_1.3.10--input\"]");
//	private By HowWeCanHelpDropdown = By.xpath("//*[@id=\"Embed\"]/div/div/div/div/form/main/div[2]/div[3]/div/div[1]/div/div");
//	private By SubjectInputField = By.xpath("//*[@id=\"4val-field_1.3.10--input\"]");
//	private By MessageInputField = By.xpath("//*[@id=\"5val-field_1.3.10--input\"]");
//	private By SubmitContactButton = By.id("button-ok");
////	public void selectOption(int i) {
////		log.info("Selecting option " + i + " from dropdown");
////		WebElement dropdownElement = find(HowWeCanHelpDropdown);
////		Select dropdown = new Select(dropdownElement);
////		dropdown.selectByIndex(i);
////	}
////public void Contactforminput (String name,String email,String subject,String message){
////	waitForVisibilityOf(SupportButton,10);
////		click(SupportButton);
////	type(name,NameInputField);
////	type(email,EmailInputField);
////	type(message,MessageInputField);
////	type(subject,SubjectInputField);
////	selectOption(1);
////	click(SubmitContactButton);
////}
}