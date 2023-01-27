package com.audiomovers;

import com.audiomovers.base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Omnibus_qa_test;

public class LinksVerificationTests extends TestUtilities {

	@Test(enabled = true)
	public void LogoTest() {
		log.info("Starting logo test");


		//open page
		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
		omnibus_qa_test.openPage();
		omnibus_qa_test.cookieCleaner();
		//clicking logo button
		omnibus_qa_test.clickLogoButton();
		String result = driver.getCurrentUrl();
		Assert.assertEquals(result, "https://audiomovers.com/wp/");
	}

	@Test(enabled = true)
	public void LoginLinkTest() {
		log.info("Starting login link test");


		//open page
		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
		omnibus_qa_test.openPage();
		omnibus_qa_test.cookieCleaner();
		//clicking logo button
		omnibus_qa_test.clickLoginButton();
		String result = driver.getCurrentUrl();
		Assert.assertEquals(result, "https://audiomovers.com/wp/login");
	}

	@Test()
	public void ProductsLinkTest() {
		log.info("Starting Products link test");


		//open page
		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
		omnibus_qa_test.openPage();
		omnibus_qa_test.cookieCleaner();
		//clicking Products button
		omnibus_qa_test.clickProductsButton();
		String result = driver.getCurrentUrl();
		Assert.assertEquals(result, "https://audiomovers.com/wp/listento/");
	}

	@Test()
	public void NewsLinkTest() {
		log.info("Starting News link test");


		//open page
		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
		omnibus_qa_test.openPage();
		omnibus_qa_test.cookieCleaner();
		//clicking Products button
		omnibus_qa_test.clickNewsButton();
		String result = driver.getCurrentUrl();
		Assert.assertEquals(result, "https://audiomovers.com/wp/news/");
	}

	@Test()
	public void AboutLinkTest() {
		log.info("Starting About link test");


		//open page
		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
		omnibus_qa_test.openPage();
		omnibus_qa_test.cookieCleaner();
		//clicking Products button
		omnibus_qa_test.clickAboutButton();
		String result = driver.getCurrentUrl();
		Assert.assertEquals(result, "https://audiomovers.com/wp/about/");
	}

	@Test()
	public void DownloadsLinkTest() {
		log.info("Starting Downloads link test");


		//open page
		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
		omnibus_qa_test.openPage();
		omnibus_qa_test.cookieCleaner();
		//clicking Products button
		omnibus_qa_test.clickDownloadsButton();
		String result = driver.getCurrentUrl();
		Assert.assertEquals(result, "https://audiomovers.com/wp/downloads/");
	}

	@Test()
	public void PrisingLinkTest() {
		log.info("Starting Prising link test");


		//open page
		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
		omnibus_qa_test.openPage();
		omnibus_qa_test.cookieCleaner();
		//clicking Products button
		omnibus_qa_test.clickPrisingButton();
		String result = driver.getCurrentUrl();
		Assert.assertEquals(result, "https://audiomovers.com/wp/pricing/");
	}


}
//	@Test
//	public void ListentoLinkTest() {
//		log.info("Starting Products link test");
//
//
//		//open page
//		Omnibus_qa_test omnibus_qa_test = new Omnibus_qa_test(driver, log);
//		omnibus_qa_test.openPage();
//		//clicking Products button
//		omnibus_qa_test.clickListentoButton();
//		String result = driver.getCurrentUrl();
//		Assert.assertEquals(result, "https://audiomovers.com/wp/listento/");
//	}
//}