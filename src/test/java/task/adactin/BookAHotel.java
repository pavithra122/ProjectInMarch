package task.adactin;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass {
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement ccNum;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement ccType;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement ccExpMonth;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement ccExpYear;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement ccCvv;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}
	public WebElement getCcExpYear() {
		return ccExpYear;
	}
	public WebElement getCcCvv() {
		return ccCvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
}
