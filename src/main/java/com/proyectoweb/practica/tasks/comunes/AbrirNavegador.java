package com.proyectoweb.practica.tasks.comunes;

import com.proyectoweb.practica.utils.ContansteUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

  public ContansteUrl
      contansteUrl;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(ContansteUrl.PAGINA_PRUEBA_URL));
  }

  public static AbrirNavegador paginaPrueba() {
    return Tasks.instrumented(AbrirNavegador.class);
  }
}
