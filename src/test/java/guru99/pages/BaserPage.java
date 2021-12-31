package guru99.pages;

import guru99.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BaserPage {


    public BaserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
