package task.adactin;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
		public SelectHotel() {
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath="//select[@id='location']")
		private WebElement location;
		
		@FindBy(xpath="//select[@id='hotels']")
		private WebElement hotel;
		
		@FindBy(xpath="//select[@id='room_type']")
		private WebElement roomType;

		@FindBy(xpath="//select[@id='room_nos']")
		private WebElement noOfRooms;

		@FindBy(xpath="//input[@id='datepick_in']")
		private WebElement checkInDate;

		@FindBy(xpath="//input[@id='datepick_out']")
		private WebElement checkOutDate;

		@FindBy(xpath="//select[@id='room_nos']")
		private WebElement adultsPerRoom;
		
		@FindBy(xpath="//select[@id='child_room']")
		private WebElement childPerRoom;
		
		@FindBy(xpath="//input[@id='Submit']")
		private WebElement submit;

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHotel() {
			return hotel;
		}

		public WebElement getRoomType() {
			return roomType;
		}

		public WebElement getNoOfRooms() {
			return noOfRooms;
		}

		public WebElement getCheckInDate() {
			return checkInDate;
		}

		public WebElement getCheckOutDate() {
			return checkOutDate;
		}

		public WebElement getAdultsPerRoom() {
			return adultsPerRoom;
		}

		public WebElement getChildPerRoom() {
			return childPerRoom;
		}

		public WebElement getSubmit() {
			return submit;
		}
		
	}


