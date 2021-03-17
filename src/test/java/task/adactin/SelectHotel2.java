package task.adactin;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel2 extends BaseClass{
		public SelectHotel2() {
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath="//input[@id='radiobutton_0']")
		private WebElement radioBtn;
		
		@FindBy(xpath="//input[@id='continue']")
		private WebElement continueBtn;

		public WebElement getRadioBtn() {
			return radioBtn;
		}

		public WebElement getContinueBtn() {
			return continueBtn;
		}
}
