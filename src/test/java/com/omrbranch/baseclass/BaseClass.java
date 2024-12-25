package com.omrbranch.baseclass;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
	public static WebDriver driver;
	public PointerInput pointer;
	public Sequence sequence;

	public WebElement findlocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}

	public WebElement findLocatorByXpath(String attributeValue) {
		WebElement findElement = driver.findElement(By.xpath(attributeValue));
		return findElement;
	}

	public void elementSendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void elementClick(WebElement e) {
		e.click();
	}

	public void closeCurrentWindow() {
		driver.quit();
	}

	public static void launchApplication(String platformName, String platformVersion, String deviceName,
			String automationName, String appPackage, String appActivity) throws MalformedURLException {
		DesiredCapabilities Capability = new DesiredCapabilities();
		Capability.setCapability("appium:platformName", platformName);
		Capability.setCapability("appium:platformVersion", platformVersion);
		Capability.setCapability("appium:deviceName", deviceName);
		Capability.setCapability("appium:automationName", automationName);
		Capability.setCapability("appium:appPackage", appPackage);
		Capability.setCapability("appium:appActivity", appActivity);

		java.net.URL url = new java.net.URL("http://127.0.0.1:4723/");
		driver = new AppiumDriver(url, Capability);

	}

	public void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public void swipeUp() {
		Dimension size = driver.manage().window().getSize();
		//System.out.println(size);
		int width = size.getWidth();
		int height = size.getHeight();
		// System.out.println(width);
		// System.out.println(height);
		int startY = (int) (height * 0.90);
		int endY = (int) (height * 0.10);
		int centerx = (int) (width * 0.50);
		// System.out.println(startY);
		// System.out.println(endY);
		// System.out.println(centerx);
		PointerInput input = new PointerInput(Kind.TOUCH, "finger1");
		Sequence sequence = new Sequence(input, 1);
		sequence.addAction(
				input.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerx, startY));
		sequence.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		sequence.addAction(
				input.createPointerMove(Duration.ofSeconds(1), PointerInput.Origin.viewport(), centerx, endY));
		sequence.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		RemoteWebDriver remotedriver = (RemoteWebDriver) driver;
		remotedriver.perform(Arrays.asList(sequence));
	}
}
