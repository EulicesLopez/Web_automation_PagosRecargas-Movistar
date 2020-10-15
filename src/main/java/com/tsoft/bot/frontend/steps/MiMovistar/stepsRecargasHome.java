package com.tsoft.bot.frontend.steps.MiMovistar;


import com.tsoft.bot.frontend.pageobject.MiMovistar.PageRecargasHome;
import com.tsoft.bot.frontend.utility.CallerJSON_MiMovistarRecarga;
import com.tsoft.bot.frontend.utility.CallerJSON_MiMovistarRecargaV2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class stepsRecargasHome extends PageRecargasHome {
    /*---------------------------------------------------------------------------------------------------------*/
    @Given("^se ingresa en la URL el token generado \"([^\"]*)\"$")
    public void seIngresaEnLaURLElTokenGenerado(String casoDePrueba) throws Throwable {
        PageRecargasHome.ingresoDeUrlDelTokenGenerado(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se ingresa el numero celular \"([^\"]*)\"$")
    public void seIngresaElNumeroCelular(String casoDePrueba) throws Throwable {
        PageRecargasHome.ingresoDeNumeroCelular(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^monto a recargar \"([^\"]*)\"$")
    public void montoARecargar(String casoDePrueba) throws Throwable {
        PageRecargasHome.ingresoDeMontoRecargar(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se da click en el boton Continuar$")
    public void seDaClickEnElBotonContinuar() throws Throwable {
        PageRecargasHome.clickBotonContinuar();
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @Given("^se genera la URL mediante el API_TEST_recargas$")
    public void seGeneraLaURLMedianteElAPI_TEST_recargas() throws Throwable {
        CallerJSON_MiMovistarRecarga.API_API_TEST_recargas();
    }

    /*---------------------------------------------------------------------------------------------------------*/
    @Given("^se genera la URL mediante el API_TEST_recargasVersion(\\d+)$")
    public void seGeneraLaURLMedianteElAPI_TEST_recargasVersion(int arg0) throws Throwable {
        CallerJSON_MiMovistarRecargaV2.API_API_TEST_recargas();
    }
}
