package guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentSuccessfulPage extends BaserPage{

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement PaymentSuccessfulMessage;

    public WebElement getPaymentSuccessfulMessage() {
        return PaymentSuccessfulMessage;
    }
}
