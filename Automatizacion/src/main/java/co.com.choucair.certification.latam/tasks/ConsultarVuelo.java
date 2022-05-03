package co.com.choucair.certification.latam.tasks;

import co.com.choucair.certification.latam.model.DataConsultaBD;
import co.com.choucair.certification.latam.userinterface.ConsultarVueloXpath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ConsultarVuelo implements Task {
    private DataConsultaBD dataConsultaBD;
    //public DataConsultaBD dataConsultaBD = new DataConsultaBD();

    public ConsultarVuelo(DataConsultaBD dataConsultaBD){
        this.dataConsultaBD =dataConsultaBD;}

    public static ConsultarVuelo the(DataConsultaBD dataConsultaBD) {
        return Tasks.instrumented(ConsultarVuelo.class,dataConsultaBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ConsultarVueloXpath.TIPO_VIAJE_CLICK));
        actor.attemptsTo(Click.on(ConsultarVueloXpath.TIPO_VIAJE_SELCT));
        //if (dataConsultaBD.getTipovuelo().equals("Ida y Vuelta")) {actor.attemptsTo(Click.on(ConsultarVueloXpath.SELECT_FLIGHT_ROUNDTRIP));}
        //else {actor.attemptsTo(Click.on(ConsultarVueloXpath.SELECT_FLIGHT_OUTBOUND));}
        //actor.attemptsTo(Enter.theValue(dataConsultaBD.getOrigen()).into(ConsultarVueloXpath.SELECT_ORIGIN));
        //actor.attemptsTo(Click.on(ConsultarVueloXpath.INPUT_ORIGIN));
               }
}
