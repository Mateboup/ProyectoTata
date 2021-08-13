package com.proyectoweb.practica.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaInicioPage {

  public static final Target TXT_REGISTRO =
          Target.the("Opcion registro usuario" ).locatedBy("//*[@id=\"signin2\"]");

  public static final Target LBL_NOMBRE_USUARIO =
          Target.the("Nombre usuario" ).locatedBy("//*[@id=\"sign-username\"]");

  public static final Target LBL_CONTRASEÑA =
          Target.the("Contraseña usuario" ).locatedBy("//*[@id=\"sign-password\"]");

  public static final Target BTN_INSCRIBIRSE =
          Target.the("Boton Inscribirse" ).locatedBy("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

  public static final Target TXT_INICIAR_SESION =
          Target.the("Opcion Iniciar Sesion" ).locatedBy("//*[@id=\"login2\"]");

  public static final Target LBL_NOMBRE_USUARIO_INICIO_SESION=
          Target.the("Nombre usuario" ).locatedBy("//*[@id=\"loginusername\"]");

  public static final Target LBL_CONTRASEÑA_INICIO_SESION =
          Target.the("Contraseña usuario" ).locatedBy("//*[@id=\"loginpassword\"]");

  public static final Target BTN_INICIO_SESION =
          Target.the("Boton iniciar sesion" ).locatedBy("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

  public static final Target TXT_CONTACTO =
          Target.the("Opcion Contacto" ).locatedBy("//*[@id=\"navbarExample\"]/ul/li[2]/a");

  public static final Target LBL_CORREO =
          Target.the("Correo electronico" ).locatedBy("//*[@id=\"recipient-email\"]");

  public static final Target LBL_NOMBRE_CONTACTO =
          Target.the("Nombre contacto" ).locatedBy("//*[@id=\"recipient-name\"]");

  public static final Target LBL_MENSAJE =
          Target.the("Mensaje Contacto" ).locatedBy("//*[@id=\"message-text\"]");

  public static final Target BTN_ENVIAR_MENSAJE =
          Target.the("Boton Enviar Mensaje Contacto" ).locatedBy("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

  public static final Target TXT_SELECCIONAR_SECCION =
          Target.the("Seleccionar Seccion" ).locatedBy("//a[@id='itemc' and (contains(text(),'{0}'))]");

  public static final Target TXT_PRODUCTO =
          Target.the("Seleccionar producto" ).locatedBy("//*[@id=\"tbodyid\"]/div[6]//*[contains(text(),'MacBook Pro')]");

  public static final Target BTN_ADICIONAR_CARRITO =
          Target.the("Adicionar producto" ).locatedBy("//*[@id=\"tbodyid\"]/div[2]/div/a");



  private PaginaInicioPage() {}
}

