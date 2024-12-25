package com.omrbranch.mobile;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.omrbranch.baseclass.BaseClass;

public class AppiumProject extends BaseClass {
@BeforeClass
private void beforeClass() throws MalformedURLException {
launchApplication("android", "13", "emulator-5554", "uiautomator2", "com.omr_branch", "com.omr_branch.MainActivity");
implicitWait(30);
}
@BeforeMethod
private void before() {
System.out.println("Start Time:"+System.currentTimeMillis());	
}

@Test
private void test() {
 WebElement userName = findLocatorByXpath("//android.widget.EditText[@content-desc=\"Email Address\"]");
 elementSendKeys(userName, "sugubsk@gmail.com");
 WebElement passsword = findLocatorByXpath("//android.widget.EditText[@content-desc=\"Password\"]");
 elementSendKeys(passsword, "Greens@2020");
 WebElement loginButton = findLocatorByXpath("//android.widget.TextView[@text=\"Login\"]");
 elementClick(loginButton);
 
 
 WebElement hoteltext = findLocatorByXpath("//*[@resource-id='search_explore_hotel']");
 String text = hoteltext.getText();
 System.out.println(text);
WebElement state = findLocatorByXpath("//android.widget.TextView[@text=\"Select State\"]");
elementClick(state);
WebElement stateName = findLocatorByXpath("//android.widget.TextView[@text=\"Karnataka\"]");
elementClick(stateName);
WebElement city = findLocatorByXpath("//android.widget.TextView[@text=\"Select City\"]");
elementClick(city);
WebElement cityName = findLocatorByXpath("//android.widget.TextView[@text=\"Mysuru\"]");
elementClick(cityName);
WebElement selcetRoom = findLocatorByXpath("//android.widget.TextView[@text=\"Select Room Type\"]");
elementClick(selcetRoom);
 WebElement roomType = findLocatorByXpath("//android.widget.TextView[@text=\"Standard\"]");
 elementClick(roomType);
 WebElement ceckIn = findLocatorByXpath("//android.widget.EditText[@content-desc=\"search_select_checkin\"]");
 elementClick(ceckIn);
 WebElement selectedCheckIn = findLocatorByXpath("//android.view.View[@content-desc=\"01 August 2024\"]");
 elementClick(selectedCheckIn);
 WebElement okBtnChckIn = findLocatorByXpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
 elementClick(okBtnChckIn);
 WebElement checkOut = findLocatorByXpath("//android.widget.EditText[@content-desc=\"search_select_checkout\"]");
 elementClick(checkOut);
 WebElement selectedCheckOut = findLocatorByXpath("//android.view.View[@content-desc=\"11 August 2024\"]");
 elementClick(selectedCheckOut);
 WebElement okBtnChckOut = findLocatorByXpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
 elementClick(okBtnChckOut);
 WebElement noOfRoom = findLocatorByXpath("//android.widget.TextView[@text=\"No. Of Room\"]");
 elementClick(noOfRoom);
 WebElement roomCount = findLocatorByXpath("//android.widget.TextView[@text=\"2-Two\"]");
 elementClick(roomCount);
 swipeUp();
 WebElement noOfAdults = findLocatorByXpath("//android.widget.TextView[@text=\"No. Of Adults\"]");
 elementClick(noOfAdults);
 WebElement selectedAdults = findLocatorByXpath("//android.widget.TextView[@text=\"1-One\"]");
 elementClick(selectedAdults);
 WebElement noOfChlid = findLocatorByXpath("//android.widget.EditText[@content-desc=\"search_no_of_children\"]");
 elementSendKeys(noOfChlid, "1");
 WebElement searchButton = findLocatorByXpath("//android.widget.TextView[@text=\"Search\"]");
 elementClick(searchButton);
 
 
 WebElement selectHotelTitle = findLocatorByXpath("//*[@resource-id='select_hotel_text']");
 String text2 = selectHotelTitle.getText();
 System.out.println(text2);
 swipeUp();
 WebElement selectHotel = findLocatorByXpath("//android.widget.TextView[@text=\"Continue\"]");
 elementClick(selectHotel);
 WebElement popUp = findLocatorByXpath("//*[@resource-id='android:id/button2']");
 elementClick(popUp);
 
 swipeUp();
 WebElement bookingFor = findLocatorByXpath("(//android.view.ViewGroup[@resource-id=\"book_hotel_booking_for\"])[1]/android.widget.ImageView");
 elementClick(bookingFor);
 WebElement salutationselect = findLocatorByXpath("//android.widget.TextView[@text=\"Select Salutation\"]");
 elementClick(salutationselect);
 WebElement Salutation = findLocatorByXpath("//android.widget.TextView[@text=\"Mr.\"]");
 elementClick(Salutation);
 WebElement firstname = findLocatorByXpath("//*[@resource-id='book_hotel_first_name']");
 elementSendKeys(firstname, "Sugumar");
 WebElement lastName = findLocatorByXpath("//*[@resource-id='book_hotel_last_name']");
 elementSendKeys(lastName, "Balu");
 WebElement mobNo = findLocatorByXpath("//*[@resource-id='book_hotel_mobile_no']");
elementSendKeys(mobNo, "9944729274");
 WebElement emailAddress = findLocatorByXpath("//*[@resource-id='book_hotel_email']");
 elementSendKeys(emailAddress, "sugubsk@gmail.com");
 WebElement GSTdetails = findLocatorByXpath("//android.view.ViewGroup[@resource-id=\"book_hotel_enter_gst\"]/android.widget.ImageView");
 elementClick(GSTdetails);
 swipeUp();
 
 WebElement registratioNo = findLocatorByXpath("//*[@resource-id='book_hotel_registration']");
 elementSendKeys(registratioNo, "9043592058");
 WebElement companyName = findLocatorByXpath("//*[@resource-id='book_hotel_company_name']");
 elementSendKeys(companyName, "Greens Tech OMR Branch");
 WebElement companyAddress = findLocatorByXpath("//*[@resource-id='book_hotel_company_address']");
 elementSendKeys(companyAddress, "Thoraipakkam");
 WebElement nextButton = findLocatorByXpath("//android.widget.TextView[@text=\"Next\"]");
 elementClick(nextButton);
 
 WebElement otherRequest = findLocatorByXpath("//*[@resource-id='book_hotel_any_other_request']");
 elementSendKeys(otherRequest, "need accommodation for driver");
 WebElement NextButton = findLocatorByXpath("//android.widget.TextView[@text=\"Next\"]");
 elementClick(NextButton);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
@AfterMethod
private void after() {
System.out.println("End Time:"+System.currentTimeMillis());
}
@AfterClass
private void afterClass() {
//closeCurrentWindow();
}
}
