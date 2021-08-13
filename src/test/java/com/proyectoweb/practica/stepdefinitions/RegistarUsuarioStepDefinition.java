package com.proyectoweb.practica.stepdefinitions;

import com.proyectoweb.practica.questions.CapturarMensaje;
import com.proyectoweb.practica.tasks.RegistrarUsuario;
import com.proyectoweb.practica.tasks.comunes.AbrirNavegador;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static com.proyectoweb.practica.utils.enums.EnumMensajeAlerta.REGISTRADO_EXITOSAMENTE;
import static com.proyectoweb.practica.utils.enums.EnumMensajeAlerta.USUARIO_EXISTENTE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class RegistarUsuarioStepDefinition {
  private Actor Mateo = Actor.named("Sam");


  @Before
  public void configurarUrlInicial() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que estoy en el sitio web en la pestaña$")
  public void queEstoyEnElSitioWebEnLaPestaña() {
    theActorCalled("Sam").wasAbleTo(AbrirNavegador.paginaPrueba());
  }

  @Cuando("^realice el registro en el sitio web$")
  public void realiceElRegistroEnElSitioWeb(Map<String,String> mapDatosUsuario) {
      theActorInTheSpotlight().attemptsTo(RegistrarUsuario.conLosDatos(mapDatosUsuario));
  }

  @Entonces("^el registro debe ser exitoso$")
  public void elRegistroDebeSerExitoso() {
    theActorInTheSpotlight()
            .should(
                    seeThat(
                            CapturarMensaje.alertaDesplegada(),
                            containsString(REGISTRADO_EXITOSAMENTE.getMensaje())));

  }


  @Entonces("^se debe visualizar un mensaje informando duplicidad$")
  public void seDebeVisualizarUnMensajeInformandoDuplicidad() {
    theActorInTheSpotlight()
            .should(
                    seeThat(
                            CapturarMensaje.alertaDesplegada(),
                            containsString(USUARIO_EXISTENTE.getMensaje())));
  }



  @Dado("^que estoy en el sitio web en la pestaña \"([^\"]*)\"$")
  public void queEstoyEnElSitioWebEnLaPestaña(String arg0) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }
}

