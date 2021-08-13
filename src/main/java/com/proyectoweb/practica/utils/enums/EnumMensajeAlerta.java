package com.proyectoweb.practica.utils.enums;

public enum EnumMensajeAlerta {
    USUARIO_EXISTENTE("This user already exist."),
    REGISTRADO_EXITOSAMENTE("Sign up successful."),
    INICIO_SESION_CORRECTAMENTE(""),
    FORMULARIO_EXITOSO("Thanks for the message!!"),
    ADICIONAR_PRODUCTO("Product added"),
    INICIO_SESION_FALLIDO("");

    private final String mensaje;

    EnumMensajeAlerta(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
