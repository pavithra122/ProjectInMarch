package task.adactin;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseClass  b=new BaseClass();
		b.getDriver();
		Thread.sleep(7000);
		b.launchUrl("http://adactinhotelapp.com/");
		//login page
		
		LoginPage l=new LoginPage();
		
		WebElement txtUsername = l.getTxtUserName();
		Thread.sleep(7000);
		b.enterText(txtUsername, "Gurusriramesh");
		WebElement txtPassWord = l.getTxtPassWord();
		b.enterText(txtPassWord, "123456789");
		WebElement btnLogin = l.getBtnLogin();
		b.btnClick(btnLogin);
		//select hotel
		SelectHotel s=new SelectHotel();
		
		WebElement location = s.getLocation();
		b.selectByVisibleText(location, "Paris");
		
		WebElement hotel = s.getHotel();
		b.selectByVisibleText(hotel, "Hotel Cornice");
		
		WebElement roomType = s.getRoomType();
		b.selectByVisibleText(roomType, "Super Deluxe");
		
		WebElement noOfRooms = s.getNoOfRooms();
		b.selectByVisibleText(noOfRooms, "3 - Three");
		
		WebElement checkInDate = s.getCheckInDate();
		b.btnClear(checkInDate);
		b.enterText(checkInDate, "30/03/2021");
		
		WebElement checkOutDate = s.getCheckOutDate();
		b.btnClear(checkOutDate);
		b.enterText(checkOutDate, "31/03/2021");
		
		WebElement adultsPerRoom = s.getAdultsPerRoom();
		b.selectByVisibleText(adultsPerRoom, "2 - Two");
		
		WebElement childPerRoom = s.getChildPerRoom();
		s.selectByVisibleText(childPerRoom, "0 - None");
		b.screenShot("loginScrnshot");
		WebElement submit = s.getSubmit();
		b.btnClick(submit);
		
		//3rd page Select hotel
		
		SelectHotel2 s2=new SelectHotel2();
		
		WebElement radioBtn = s2.getRadioBtn();
		b.btnClick(radioBtn);
		WebElement continueBtn = s2.getContinueBtn();
		b.btnClick(continueBtn);
		
		//4th page Book a hotel
		
		BookAHotel bh=new BookAHotel();
		
		WebElement firstName = bh.getFirstName();
		b.enterText(firstName, "pavithra");
		
		WebElement lastName = bh.getLastName();
		b.enterText(lastName, "v");
		
		WebElement address = bh.getAddress();
		b.enterText(address, "5,north street,thuraipakkam,omr");
		WebElement ccNum = bh.getCcNum();
		b.enterText(ccNum, "9876543210987654");
		WebElement ccType = bh.getCcType();
		b.selectByVisibleText(ccType, "Master Card");
		WebElement ccExpMonth = bh.getCcExpMonth();
		b.selectByVisibleText(ccExpMonth, "August");
		WebElement ccExpYear = bh.getCcExpYear();
		b.selectByVisibleText(ccExpYear, "2022");
		WebElement ccCvv = bh.getCcCvv();
		b.enterText(ccCvv, "546789234677");
		
		WebElement bookNow = bh.getBookNow();
		b.btnClick(bookNow);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
