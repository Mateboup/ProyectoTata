package com.proyectoweb.practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.proyectoweb.practica.usersinterfaces.PaginaInicioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormulario implements Task {

    Map<String, String> mapDatosUsuario;

    public LlenarFormulario(Map<String, String> mapDatosUsuario) {
        this.mapDatosUsuario = mapDatosUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(TXT_CONTACTO),
                Enter.theValue(mapDatosUsuario.get("Correo".toString())).into(LBL_CORREO),
                Enter.theValue(mapDatosUsuario.get("Correo".toString())).into(LBL_CORREO),
                Enter.theValue(mapDatosUsuario.get("Nombre".toString())).into(LBL_NOMBRE_CONTACTO),
                Enter.theValue(mapDatosUsuario.get("Mensaje".toString())).into(LBL_MENSAJE),
                Click.on(BTN_ENVIAR_MENSAJE));

    }

    public static Performable conLosDatos(
            Map<String, String> mapDatosUsuario) {
        return instrumented(LlenarFormulario.class, mapDatosUsuario);
    }


}
