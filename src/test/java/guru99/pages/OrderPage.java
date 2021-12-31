package guru99.pages;

import guru99.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BaserPage{

    @FindBy(xpath = "//h2")
    private WebElement header;

    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement toyPrice;

    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantityDrop;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNowButton;



    public void BuyNowButton() {
        CommonUtils.clickWithWait(buyNowButton);
    }

    public void setQuantityDrop(String quantity) {
        Select select = new Select(quantityDrop);

        select.selectByValue(quantity);
    }

    public WebElement getToyPrice() {
        return toyPrice;
    }

    public WebElement getHeader() {
        return header;
    }
}
