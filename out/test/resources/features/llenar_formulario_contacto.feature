#language: es

Característica: Validar que un usuario se pueda llenar el formulario de contacto en el sitio web
  Yo usuario de product Store
  deseo poder llenar el formulario de contacto en la en el sitio web
  para poder dejar mis datos registrados

  @InicarSesionCorrectamente
  Esquema del escenario: Llenar formulario de contacto
    Dado que estoy en el sitio web en la pestaña
    Cuando realice el llenado del formulario de contacto en el sitio web
      |  Nombre    |  <Nombre>      |
      |  Correo    |  <Correo>      |
      |  Mensaje    |  <Mensaje>    |
    Entonces debe mostrar un mensaje con exitoso

    Ejemplos:
      | Nombre      | Correo            |Mensaje|
      | Mateo       | PRUEBA@GMAIL.COM  |M      |