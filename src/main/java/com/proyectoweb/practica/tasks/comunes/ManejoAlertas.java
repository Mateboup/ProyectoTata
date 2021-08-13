package com.proyectoweb.practica.tasks.comunes;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public final class ManejoAlertas {

  private ManejoAlertas() {}

  public static void aceptarAlerta() {
    BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().switchTo().alert().accept();
  }

  public static String obtenerTexto() {
    return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().switchTo().alert().getText();
  }


}
