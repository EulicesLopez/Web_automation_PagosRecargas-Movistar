package com.tsoft.bot.frontend.steps.MiMovistar;

import com.tsoft.bot.frontend.pageobject.MiMovistar.PageRecargasPago;
import cucumber.api.java.en.And;


public class stepsRecargasPago extends PageRecargasPago {
/*---------------------------------------------------------------------------------------------------------*/
    @And("^se ingresa el numero de tarjeta \"([^\"]*)\"$")
    public void seIngresaElNumeroDeTarjeta(String casoDePrueba) throws Throwable {
        PageRecargasPago.ingresoNumeroTarjeta(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se ingresa el mes de vencimiento \"([^\"]*)\"$")
    public void seIngresaElMesDeVencimiento(String casoDePrueba) throws Throwable {
        PageRecargasPago.ingresoMesVencimiento(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se ingresa el anio de vencimiento \"([^\"]*)\"$")
    public void seIngresaElAnioDeVencimiento(String casoDePrueba) throws Throwable {
        PageRecargasPago.ingresoAnioVencimiento(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se ingresa el codigo de verificacion \"([^\"]*)\"$")
    public void seIngresaElCodigoDeVerificacion(String casoDePrueba) throws Throwable {
        PageRecargasPago.ingresoCodigoVerificacion(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se da click en el boton Pagar$")
    public void seDaClickEnElBotonPagar() throws Throwable {
        PageRecargasPago.clickEnElBotonPagar();

    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se selecciona una tarjeta y se da click en el boton Pagar$")
    public void seSeleccionaUnaTarjetaYSeDaClickEnElBotonPagar() throws Throwable {
        clickEnElBotonPagarTarjetaGuardada();
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se selecciona la opción guardar tarjeta$")
    public void seSeleccionaLaOpciónGuardarTarjeta() throws Throwable {
        activarCheckGuardarTarjeta();

    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se selecciona el boton pagar otra tarjeta$")
    public void seSeleccionaElBotonPagarOtraTarjeta() throws Throwable {
        clicPagarOtraTarjeta();
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se ingresa datos de tarjeta \"([^\"]*)\"$")
    public void seIngresaDatosDeTarjeta(String casoDePrueba) throws Throwable {
        PageRecargasPago.ingresoNumeroTarjeta(casoDePrueba);
        PageRecargasPago.ingresoMesVencimiento(casoDePrueba);
        PageRecargasPago.ingresoAnioVencimiento(casoDePrueba);
        PageRecargasPago.ingresoCodigoVerificacion(casoDePrueba);
    }
    /*---------------------------------------------------------------------------------------------------------*/
    @And("^se selecciona boton eliminar tarjeta$")
    public void seSeleccionaBotonEliminarTarjeta() throws Throwable {
        clicEliminarTarjeta();
    }

    /*---------------------------------------------------------------------------------------------------------*/



}
