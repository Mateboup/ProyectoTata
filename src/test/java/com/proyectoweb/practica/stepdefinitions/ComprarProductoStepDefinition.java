package com.proyectoweb.practica.stepdefinitions;

import com.proyectoweb.practica.questions.CapturarMensaje;
import com.proyectoweb.practica.tasks.ComprarProducto;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.Map;

import static com.proyectoweb.practica.utils.enums.EnumMensajeAlerta.ADICIONAR_PRODUCTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class ComprarProductoStepDefinition {


    @Cuando("^seleccione un sección de articulos y luego un producto$")
    public void seleccioneUnSecciónDeArticulosYLuegoUnProducto(Map<String,String> mapDatosUsuario) {
        theActorInTheSpotlight().attemptsTo(ComprarProducto.conLosDatos(mapDatosUsuario));
    }

    @Entonces("^debe permitir adicionar el producto$")
    public void debePermitirAdicionarElProducto() {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                CapturarMensaje.alertaDesplegada(),
                                containsString(ADICIONAR_PRODUCTO.getMensaje())));
    }


}
