package com.co.choucair.testing.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_exitosa.feature",
        glue = "com.co.choucair.testing.prueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class Compra {
}
