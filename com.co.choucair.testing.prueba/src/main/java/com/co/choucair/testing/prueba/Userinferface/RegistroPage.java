package com.co.choucair.testing.prueba.Userinferface;

import com.sun.javafx.image.impl.BaseByteToIntConverter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {
    public static final Target EMAIL = Target.the("ingresar el email").located(By.id("email_create"));
    public static final Target CREATE_AACCOUNT = Target.the("boton crear cuenta").located(By.id("SubmitCreate"));
    public static final Target MRS = Target.the("seleccionar genero").located(By.id("uniform-id_gender2"));
    public static final Target FIRST_NAME = Target.the("ingresar nombre").located(By.id("customer_firstname"));
    public static final Target LAST_NAME = Target.the("ingresar apellido").located(By.id("customer_lastname"));
    public static final Target EMAILDOS = Target.the("ingresar el email").located(By.id("email"));
    public static final Target PASSWORD = Target.the("ingresar contraseña").located(By.id("passwd"));
    public static final Target DATE_OF_BIRTH = Target.the("seleccionar dia de nacimiento").located(By.id("days"));
    public static final Target MES = Target.the("seleccionar mes de nacimiento").located(By.id("months"));
    public static final Target ANO = Target.the("seleccionar el año de nacimiento").located(By.id("years"));
    public static final Target FIRST_NAMEDOS = Target.the("ingresar nombre").located(By.id("firstname"));
    public static final Target LAST_NAMEDOS = Target.the("ingresar apellido").located(By.id("lastname"));
    public static final Target COMPANY = Target.the("ingresar el nombre de la compañia").located(By.id("company"));
    public static final Target ADDRESS = Target.the("ingresar la direccion de entrega").located(By.id("address1"));
    public static final Target ADRESSDOS = Target.the("ingresar torre y apartamento").located(By.id("address2"));
    public static final Target CITY = Target.the("ingrese ciudad").located(By.id("city"));
    public static final Target STATE = Target.the("seleccione el estado").located(By.id("id_state"));
    public static final Target POSTAL_CODE = Target.the("ingrese el codigo postal").located(By.id("postcode"));
    public static final Target COUNTRY = Target.the("seleccione el pais").located(By.id("id_country"));
    public static final Target ADDITIONAL_INFORMATION = Target.the("ingrese informacion adicional").located(By.id("other"));
    public static final Target PHONE_HOME = Target.the("ingrese numero de telefono").located(By.id("phone"));
    public static final Target MOBILE_HOME = Target.the("ingrese numero de celular").located(By.id("phone_mobile"));
    public static final Target ALIAS = Target.the("ingrese un alias").located(By.id("alias"));
    public static final Target REGISTER = Target.the("Crear usuario").located(By.xpath("//span[contains(text(), 'Register')]"));

}
