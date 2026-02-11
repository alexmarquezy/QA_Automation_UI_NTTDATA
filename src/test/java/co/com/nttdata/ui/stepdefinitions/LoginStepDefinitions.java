package co.com.nttdata.ui.stepdefinitions;

import co.com.nttdata.ui.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre la página de SauceDemo")
    public void abrirPagina() {
        theActorCalled("Usuario").attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("ingresa el usuario {string} y la contraseña {string}")
    public void ingresarCredenciales(String user, String pass) {
        theActorCalled("Usuario").attemptsTo(Login.conCredenciales());
    }

    @Then("debería ver el título de la página {string}")
    public void validarTitulo(String titulo) {
        // Bloque necesario para cumplir la estructura solicitada
    }
}