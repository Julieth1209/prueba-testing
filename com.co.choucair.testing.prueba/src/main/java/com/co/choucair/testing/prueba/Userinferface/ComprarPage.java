package com.co.choucair.testing.prueba.Userinferface;

import com.sun.javafx.image.impl.BaseByteToIntConverter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;



public class ComprarPage extends PageObject {

    public static final Target WOMEN = Target.the("boton de seccion ropa mujer").located(By.xpath("//a[contains(text(),'Women')]"));
    public static final Target TSHIRTS= Target.the("boton de shirts").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
    public static final Target ADD_TO_CART= Target.the("agregar al carro").located(By.xpath("//span[contains(text(), 'Add to cart')]"));
    public static final Target MY_ACCOUNT = Target.the("Bienvenido").located(By.xpath("//p[contains(text(), 'Welcome')]"));
    public static final Target CHECKOUT= Target.the("continuar con la compra").located(By.xpath("//span[contains(text(), 'Proceed to checkout')]"));
    public static final Target CHECKOUT_DOS= Target.the("continuar con la compra").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
    public static final Target CHECKOUT_TRES= Target.the("continuar con la compra").located(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
    public static final Target ACEPTACION = Target.the("continuar con la compra").located(By.id("uniform-cgv"));
    public static final Target CHECKOUT_CUATRO= Target.the("continuar con la compra").located(By.xpath("//*[@id=\"form\"]/p/button/span"));
    public static final Target COMPRA_EXITOSA= Target.the("continuar con la compra").located(By.xpath("//h1[contains(text(), 'Please choose your payment method')]"));




}
