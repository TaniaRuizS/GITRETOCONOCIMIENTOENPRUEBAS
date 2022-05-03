package co.com.choucair.certification.latam.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultarVueloXpath extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("where we write the first name").located
            (By.xpath("//input[@ng-model= 'FirstName']"));
}
