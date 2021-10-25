package com.co.choucair.testing.prueba.Userinferface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target  REGISTRO =Target.the("Click en registro").located(By.xpath("//a[contains(text(), 'Sign in')]"));
}
