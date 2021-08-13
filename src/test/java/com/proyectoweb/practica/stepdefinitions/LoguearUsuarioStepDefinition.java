package com.proyectoweb.practica.stepdefinitions;

import com.proyectoweb.practica.questions.CapturarMensaje;
import com.proyectoweb.practica.tasks.LoguearUsuario;
import com.proyectoweb.practica.tasks.RegistrarUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.Map;

import static com.proyectoweb.practica.utils.enums.EnumMensajeAlerta.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class LoguearUsuarioStepDefinition {
    
    @Cuando("^realice el Logueo en el sitio web$")
    public void realiceElLogueoEnElSitioWeb(Map<String,String> mapDatosUsuario) {
        theActorInTheSpotlight().attemptsTo(LoguearUsuario.conLosDatos(mapDatosUsuario));
    }

    @Entonces("^debo inciar sesion correctamente$")
    public void deboInciarSesionCorrectamente() {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                CapturarMensaje.alertaDesplegada(),
                                containsString(INICIO_SESION_CORRECTAMENTE.getMensaje())));
    }

    @Entonces("^se debe visualizar un mensaje informando usuario o contraseña incorrecta$")
    public void seDebeVisualizarUnMensajeInformandoUsuarioOContraseñaIncorrecta() {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                CapturarMensaje.alertaDesplegada(),
                                containsString(INICIO_SESION_FALLIDO.getMensaje())));
    }

}
