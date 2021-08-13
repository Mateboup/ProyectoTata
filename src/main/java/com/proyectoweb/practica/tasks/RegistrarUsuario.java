package com.proyectoweb.practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.proyectoweb.practica.usersinterfaces.PaginaInicioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuario implements Task {

    Map<String, String> mapDatosUsuario;

    public RegistrarUsuario(Map<String, String> mapDatosUsuario) {
        this.mapDatosUsuario = mapDatosUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(TXT_MENU_PRINCIPAL.of(mapDatosUsuario.get("Pestana"))),
                Enter.theValue(mapDatosUsuario.get("Nombre".toString())).into(LBL_NOMBRE_USUARIO),
                Enter.theValue(mapDatosUsuario.get("Contrasena".toString())).into(LBL_CONTRASEÑA),
                Click.on(BTN_INSCRIBIRSE));
    }

    public static Performable conLosDatos(
            Map<String, String> mapDatosUsuario) {
        return instrumented(RegistrarUsuario.class, mapDatosUsuario);
    }


}
