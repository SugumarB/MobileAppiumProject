package com.omrbranch.mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class MobileAppium {
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities desc = new DesiredCapabilities();
	desc.setCapability("platformName", "android");
	desc.setCapability("appium:platformversion", "13");
	desc.setCapability("appium:deviceName", "emulator-5554");
	desc.setCapability("appium:automationName", "uiautomator2");
	desc.setCapability("appium:appPackage", "com.omr_branch");
	desc.setCapability("appium:appActivity", "com.omr_branch.MainActivity");
	URL url = new URL("http://127.0.0.1:4723/");
	WebDriver driver = new AppiumDriver(url,desc);
	
	WebElement Heading = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"login_joining_automation_text\"]"));
	String Headingtxt = Heading.getText();
	System.out.println(Headingtxt);
	System.out.println("Application Launched Successfully");
	WebElement userName = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Email Address\"]"));
	userName.sendKeys("sugubsk@gmail.com");
	WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Password\"]"));
	password.sendKeys("Greens@2020");
	WebElement loginButton = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"login_button\"]"));
	loginButton.click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	WebElement state = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select State\"]"));
	state.click();
	WebElement stateName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Karnataka\"]"));
	stateName.click();
	
	WebElement city = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select City\"]"));
	city.click();
	WebElement cityName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Mysuru\"]"));
	cityName.click();
	
	WebElement selectRoom = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select Room Type\"]"));
	selectRoom.click();
	WebElement roomType = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Standard\"]"));
	roomType.click();
	
	WebElement checkIn = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_select_checkin\"]"));
	checkIn.click();
	WebElement selectedCheckIn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"26 July 2024\"]"));
	selectedCheckIn.click();
	WebElement oK = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
	oK.click();
	
	WebElement checkout = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_select_checkout\"]"));
	checkout.click();
	WebElement CheckOutDate = driver.findElement(By.xpath("//android.view.View[@content-desc=\"30 July 2024\"]"));
	CheckOutDate.click();
	WebElement oK1 = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
	oK1.click();
	WebElement noofRoom = driver.findElement(By.xpath("//android.widget.TextView[@text=\"No. Of Room\"]"));
	noofRoom.click();
	WebElement roomCount = driver.findElement(By.xpath("//android.widget.TextView[@text=\"2-Two\"]"));
	roomCount.click();
	
	WebElement adults = driver.findElement(By.xpath("//android.widget.TextView[@text=\"No. Of Adults\"]"));
	adults.click();
	WebElement adultCount = driver.findElement(By.xpath("//android.widget.TextView[@text=\"2-Two\"]"));
	adultCount.click();
	
	WebElement noofChild = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_no_of_children\"]"));
	noofChild.sendKeys("2");
	
	WebElement searchHotel = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Search\"]"));
	searchHotel.click();
	WebElement selecthotel = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue\"]"));
	selecthotel.click();
	
	WebElement popup = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]"));
	popup.click();
	
	WebElement bookingFor = driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"book_hotel_booking_for\"])[1]/android.widget.ImageView"));
	bookingFor.click();
	
	WebElement salutation = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select Salutation\"]"));
	salutation.click();
	
	WebElement SelectSalutation = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Mr.\"]"));
	SelectSalutation.click();
	
	WebElement firstName = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"book_hotel_first_name\"]"));
	firstName.sendKeys("Sugumar");
	WebElement lastName = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"book_hotel_last_name\"]"));
	lastName.sendKeys("balu");
	WebElement mobNo = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"book_hotel_mobile_no\"]"));
	mobNo.sendKeys("9944729274");
	WebElement email = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"book_hotel_email\"]"));
	email.sendKeys("sugubsk@gmail.com");
	WebElement GSTcheckbox = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"book_hotel_enter_gst\"]/android.widget.ImageView"));
	GSTcheckbox.click();
	
	WebElement RegistrationNo = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"book_hotel_registration\"]"));
	RegistrationNo.sendKeys("9043592058");
	WebElement companyName = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"book_hotel_company_name\"]"));
	companyName.sendKeys("Greens Tech OMR Branch");
	WebElement address = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"book_hotel_company_address\"]"));
	address.sendKeys("Thoraipakkam");
	WebElement nxtButton = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
	nxtButton.click();
	
	WebElement otherReq = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"TextInput\"]"));
	otherReq.sendKeys("Need Accomadation for Driver");
	
	WebElement nextButton = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
	nextButton.click();
	
	WebElement paymentType = driver.findElement(By.xpath("//android.view.View[@resource-id=\"step-3\"]/android.view.View/android.view.View[2]/android.view.View"));
	paymentType.click();
	WebElement cardType = driver.findElement(By.xpath("//android.view.View[@resource-id=\"payment_type\"]"));
	cardType.click();
	WebElement debitCard = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Debit Card\"]"));
	debitCard.click();
	WebElement selectCard = driver.findElement(By.xpath("//android.view.View[@resource-id=\"card_type\"]"));
	selectCard.click();
	WebElement Visa = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Visa\"]"));
	Visa.click();
	WebElement cardNo = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"card_no\"]"));
	cardNo.sendKeys("5555555555552222");
	WebElement cardName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"card_name\"]"));
	cardName.sendKeys("sugumar");
	WebElement cardMonth = driver.findElement(By.xpath("//android.view.View[@resource-id=\"card_month\"]"));
	cardMonth.click();
	WebElement SelectedMonth = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"August\"]"));
	SelectedMonth.click();
	WebElement cvv = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"cvv\"]"));
	cvv.sendKeys("344");
	WebElement Submit = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"submitBtn\"]"));
	Submit.click();
	
	
	
	
}
}
