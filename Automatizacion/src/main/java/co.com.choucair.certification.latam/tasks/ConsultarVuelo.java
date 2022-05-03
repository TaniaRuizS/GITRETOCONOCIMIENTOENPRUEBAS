package co.com.choucair.certification.latam.tasks;

import co.com.choucair.certification.latam.model.DataConsultaBD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsultarVuelo implements Task {
    private DataConsultaBD dataConsultaBD;

    public ConsultarVuelo(DataConsultaBD dataConsultaBD){
        this.dataConsultaBD =dataConsultaBD;}

    public static ConsultarVuelo the(DataConsultaBD dataConsultaBD) {
        return Tasks.instrumented(ConsultarVuelo.class,dataConsultaBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
