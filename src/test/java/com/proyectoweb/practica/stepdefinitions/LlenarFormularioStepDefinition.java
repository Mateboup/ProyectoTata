package com.proyectoweb.practica.stepdefinitions;

import com.proyectoweb.practica.questions.CapturarMensaje;
import com.proyectoweb.practica.tasks.LlenarFormulario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.Map;

import static com.proyectoweb.practica.utils.enums.EnumMensajeAlerta.FORMULARIO_EXITOSO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class LlenarFormularioStepDefinition {

    @Cuando("^realice el llenado del formulario de contacto en el sitio web$")
    public void realiceElLlenadoDelFormularioDeContactoEnElSitioWeb(Map<String, String> mapDatosUsuario) {
        theActorInTheSpotlight().attemptsTo(LlenarFormulario.conLosDatos(mapDatosUsuario));
    }

    @Entonces("^debe mostrar un mensaje con exitoso$")
    public void debeMostrarUnMensajeConExitoso() {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                CapturarMensaje.alertaDesplegada(),
                                containsString(FORMULARIO_EXITOSO.getMensaje())));
    }
}
