package com.co.choucair.testing.prueba.tasks;

import com.co.choucair.testing.prueba.Userinferface.YourLogoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private YourLogoPage yourLogoPage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Open.browserOn(yourLogoPage));

    }

    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }
}
