package guru99.pages;

import guru99.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentProcessPage extends BaserPage {


    @FindBy (xpath = "//input[@id='card_nmuber']")
    private WebElement cardNumberBox;

    @FindBy (xpath = "(//select)[1]")
    private WebElement monthDrop;

    @FindBy (xpath = "(//select)[2]")
    private WebElement yearDrop;

    @FindBy (xpath = "//input[@id='cvv_code']")
    private WebElement cvvBox;


    @FindBy (xpath = "//input[@name='submit']")
    private WebElement payButton;

    public WebElement getCardNumberBox() {
        return cardNumberBox;
    }

    public WebElement getMonthDrop() {
        return monthDrop;
    }

    public WebElement getYearDrop() {
        return yearDrop;
    }

    public WebElement getCvvBox() {
        return cvvBox;
    }


    public void payButton(){
        CommonUtils.clickWithWait(payButton);

    }
}
