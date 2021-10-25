package com.co.choucair.testing.prueba.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.bcel.generic.Select;

import static com.co.choucair.testing.prueba.Userinferface.HomePage.REGISTRO;
import static com.co.choucair.testing.prueba.Userinferface.RegistroPage.*;

public class Registrar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(REGISTRO),
                Enter.keyValues("vgftSa@ejemplo.com").into(EMAIL),
                Click.on(CREATE_AACCOUNT),
                Click.on(MRS),
                Enter.keyValues("julieth").into(FIRST_NAME),
                Enter.keyValues("Bermudez").into(LAST_NAME),
                Enter.keyValues("Dalia1209").into(PASSWORD),
                SelectFromOptions.byVisibleText("13  ").from(DATE_OF_BIRTH),
                SelectFromOptions.byVisibleText("June ").from(MES),
                SelectFromOptions.byVisibleText("1999  ").from(ANO),
                Enter.keyValues("julieth").into(FIRST_NAMEDOS),
                Enter.keyValues("bermudez").into(LAST_NAMEDOS),
                Enter.keyValues("your logo").into(COMPANY),
                Enter.keyValues("calle 24 a sur #10-08 este").into(ADDRESS),
                Enter.keyValues("Casa").into(ADRESSDOS),
                Enter.keyValues("bogota").into(CITY),
                SelectFromOptions.byVisibleText("District of Columbia").from(STATE),
                Enter.keyValues("00000").into(POSTAL_CODE),
                Enter.keyValues("Barrio santa rita").into(ADDITIONAL_INFORMATION),
                Enter.keyValues("3629764").into(PHONE_HOME),
                Enter.keyValues("3156078442").into(MOBILE_HOME),
                Enter.keyValues("carrera").into(ALIAS));
                Click.on(REGISTER);
    }


    public static Registrar enlaPagina() {
        return Tasks.instrumented(Registrar.class);
    }
}
