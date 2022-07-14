package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {
    @FindBy(xpath = "//a[contains(text(),'Sign in')]") protected WebElement entrar;

    public menuPage(){
        PageFactory.initElements(driver,this);

    }

    public void clickSignin(){
        wait.until(ExpectedConditions.elementToBeClickable(entrar));
        entrar.click();
    }
}
