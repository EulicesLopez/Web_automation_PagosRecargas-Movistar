package com.tsoft.bot.frontend.steps.MiMovistar;


import com.tsoft.bot.frontend.pageobject.MiMovistar.PageRecargaFinal;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class stepsRecargasFinal extends PageRecargaFinal {
    /*---------------------------------------------------------------------------------------------------------*/
    @Then("^se verifica que se hizo la recarga correcta\\.$")
    public void seVerificaQueSeHizoLaRecargaCorrecta() throws Throwable {
        PageRecargaFinal.verificarRecargaFinal();

}
    /*---------------------------------------------------------------------------------------------------------*/
    @Then("^se verifica que se hizo la recarga exitosa$")
    public void seVerificaQueSeHizoLaRecargaExitosa() throws Throwable {
        verificarRecargaTarjetaGuardada();
    }
    /*---------------------------------------------------------------------------------------------------------*/

}
