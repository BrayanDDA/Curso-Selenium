package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class autenticacionPage extends util {
    @FindBy(id = "email_create") protected WebElement txtemail;
    @FindBy(id = "SubmitCreate") protected WebElement btncrear;

    public autenticacionPage() {
        PageFactory.initElements(driver,this);

    }
    public void ingresarCorreo(String texto){
        wait.until(ExpectedConditions.elementToBeClickable(txtemail));
        txtemail.sendKeys(texto);
    }
    public void clickCrearCuenta(){
        btncrear.click();
    }
}
