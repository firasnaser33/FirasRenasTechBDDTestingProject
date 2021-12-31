package guru99.Step_Definitions;

import guru99.pages.OrderPage;
import guru99.pages.PaymentProcessPage;
import guru99.pages.PaymentSuccessfulPage;
import guru99.utils.CommonUtils;
import guru99.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Guru99Definitions {

OrderPage orderPage= new OrderPage();
PaymentProcessPage paymentProcessPage = new PaymentProcessPage();
PaymentSuccessfulPage paymentSuccessfulPage = new PaymentSuccessfulPage();

    @When("The user wants to verify header is {string}")
    public void the_user_wants_to_verify_header_is(String expected) {
       Assert.assertEquals(orderPage.getHeader().getText(),expected);



    }


    @When("The user wants to verify that toy price is {string}")
    public void the_user_wants_to_verify_that_toy_price_is(String actualToyPrice) {
        Assert.assertTrue(orderPage.getToyPrice().getText().contains(actualToyPrice));
    }


    @When("The user wants to verify that url contains {string}")
    public void the_user_wants_to_verify_that_url_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));

    }





    //buying toy

    @When("The user want to choose quantity as {string}")
    public void the_user_want_to_choose_quantity_as(String string) {
        orderPage.setQuantityDrop(string);

    }
    @Then("The user wants to click on BUY NOW button")
    public void the_user_wants_to_click_on_buy_now_button() {
        orderPage.BuyNowButton();

    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        paymentProcessPage.getCardNumberBox().sendKeys(dataTable.get("cardNumber"));
        paymentProcessPage.getMonthDrop().sendKeys(dataTable.get("expMonth"));
        paymentProcessPage.getYearDrop().sendKeys(dataTable.get("expYear"));
        paymentProcessPage.getCvvBox().sendKeys(dataTable.get("cvvCode"));


    }
    @Then("The user wants to click pay")
    public void the_user_wants_to_click_pay() {
        paymentProcessPage.payButton();

    }
    @Then("The user wants to verify {string} message")
    public void the_user_wants_to_verify_message(String string) {
        Assert.assertEquals(paymentSuccessfulPage.getPaymentSuccessfulMessage().getText(),string);



    }


}

