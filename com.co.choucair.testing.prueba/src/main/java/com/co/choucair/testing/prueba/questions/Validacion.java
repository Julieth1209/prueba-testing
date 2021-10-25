package com.co.choucair.testing.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.choucair.testing.prueba.Userinferface.ComprarPage.COMPRA_EXITOSA;

public class Validacion implements Question  <Boolean> {
    private String validation = "Please choose your payment method";



    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String registration = Text.of(COMPRA_EXITOSA).viewedBy(actor).asString();
        if (validation.equals(registration)){
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    public static Validacion compra() {
        return new Validacion();
    }
}
