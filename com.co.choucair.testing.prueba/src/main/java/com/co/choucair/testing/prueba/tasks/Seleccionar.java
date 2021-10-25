package com.co.choucair.testing.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.testing.prueba.Userinferface.ComprarPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Seleccionar implements Task {


    public static Seleccionar productos() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MY_ACCOUNT, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(WOMEN),
                Click.on(TSHIRTS),
                Click.on(ADD_TO_CART),
                Click.on(CHECKOUT),
                Click.on(CHECKOUT_DOS),
                Click.on(CHECKOUT_TRES),
                Click.on(ACEPTACION),
                Click.on(CHECKOUT_CUATRO)

        );

    }
}
