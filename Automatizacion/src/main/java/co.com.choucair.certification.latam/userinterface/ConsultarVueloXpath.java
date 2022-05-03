package co.com.choucair.certification.latam.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultarVueloXpath extends PageObject {

    public static final Target TIPO_VIAJE_CLICK = Target.the("Seleccionar el tipo de viaje")
            .located(By.id("btnTripTypeCTA"));
    public static final Target TIPO_VIAJE_SELCT = Target.the("Seleccionar el tipo de viaje")
            .located(By.id("btnTripType0"));
    //public static final Target SELECT_FLIGHT_OUTBOUND = Target.the("Where select outbound flight").located
            //(By.id("btnTripType0"));
    //public static final Target SELECT_FLIGHT_ROUNDTRIP = Target.the("Where select round trip flight").located
            //(By.id("btnTripType1"));
    //public static final Target SELECT_ORIGIN = Target.the("where you select the city of origin").located
            //(By.id("txtInputOrigin_field"));
    //public static final Target INPUT_ORIGIN = Target.the("where you write the city of origin").located
            //(By.id("btnItemAutoComplete_0"));

}
