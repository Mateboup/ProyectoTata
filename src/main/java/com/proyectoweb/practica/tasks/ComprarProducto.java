package com.proyectoweb.practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static com.proyectoweb.practica.usersinterfaces.PaginaInicioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ComprarProducto implements Task {

    Map<String, String> mapDatosUsuario;

    public ComprarProducto(Map<String, String> mapDatosUsuario) {
        this.mapDatosUsuario = mapDatosUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(TXT_SELECCIONAR_SECCION.of(mapDatosUsuario.get("Seccion"))));
        actor.attemptsTo(Click.on(TXT_PRODUCTO.of(mapDatosUsuario.get("Producto"))));
        actor.attemptsTo(Click.on(BTN_ADICIONAR_CARRITO));
    }

    public static Performable conLosDatos(
            Map<String, String> mapDatosUsuario) {
        return instrumented(ComprarProducto.class, mapDatosUsuario);
    }


}
