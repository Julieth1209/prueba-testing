package com.co.choucair.testing.prueba.stepdefinitions;

import com.co.choucair.testing.prueba.questions.Validacion;
import com.co.choucair.testing.prueba.tasks.Abrir;
import com.co.choucair.testing.prueba.tasks.Registrar;
import com.co.choucair.testing.prueba.tasks.Seleccionar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class CompraStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario se registra en la plataforma$")
    public void elUsuarioSeRegistraEnLaPlataforma() {
        OnStage.theActorCalled("User").wasAbleTo(
                Abrir.laPagina(),
                Registrar.enlaPagina()

        );
    }


    @When("^el usuario  selecciona los productos de compra$")
    public void elUsuarioSeleccionaLosProductosDeCompra() {
        OnStage.theActorCalled("user").
                attemptsTo(
                Seleccionar.productos()



        );
    }

    @Then("^se verifica la compra con exito$")
    public void seVerificaLaCompraConExito() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validacion.compra()));
    }

}
