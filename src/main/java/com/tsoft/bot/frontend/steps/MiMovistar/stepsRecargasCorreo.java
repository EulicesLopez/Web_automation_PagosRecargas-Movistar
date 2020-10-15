package com.tsoft.bot.frontend.steps.MiMovistar;


import com.tsoft.bot.frontend.pageobject.MiMovistar.PageRecargasCorreo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class stepsRecargasCorreo extends PageRecargasCorreo {
    /*---------------------------------------------------------------------------------------------------------*/
    @When("^se ingresa el email \"([^\"]*)\" y se da click en continuar$")
    public void seIngresaElEmailYSeDaClickEnContinuar(String casoDePrueba) throws Throwable {
        PageRecargasCorreo.ingresarCorreo_clickContinuar(casoDePrueba);
    }

    /*---------------------------------------------------------------------------------------------------------*/
    @When("^se ingresa el email \"([^\"]*)\"$")
    public void seIngresaElEmail(String correo) throws Throwable {
        ingresarCorreo(correo);
    }

    /*---------------------------------------------------------------------------------------------------------*/
    @When("^se ingresara el email \"([^\"]*)\" y se da click en continuar$")
    public void seIngresaraElEmailYSeDaClickEnContinuar(String casoDePrueba) throws Throwable {
        PageRecargasCorreo.ingresarCorreov2_clickContinuar(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
}
