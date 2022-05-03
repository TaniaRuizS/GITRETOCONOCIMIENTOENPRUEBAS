package co.com.choucair.certification.latam.stepdefinitions;

import co.com.choucair.certification.latam.model.DataConsultaBD;
import co.com.choucair.certification.latam.tasks.ConsultarVuelo;
import co.com.choucair.certification.latam.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class VuelosStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^Latam user$")
    public void latam_user() {
        OnStage.theActorCalled("Tania").wasAbleTo(OpenUp.thePage());
    }


    @When("^check round trip flights$")
    public void check_round_trip_flights(List<DataConsultaBD> dataConsultaBD) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultarVuelo.the(dataConsultaBD.get(0)));

    }

    @Then("^validate the different flights available$")
    public void validate_the_different_flights_available() {

    }



}
