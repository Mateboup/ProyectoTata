#language: es

Característica: Validar que un usuario se pueda Loguear en el sitio web
  Yo usuario de product Store
  deseo poder Loguarme en la en el sitio web
  para poder ingresar al sitio web.

  @InicarSesionCorrectamente
  Esquema del escenario: Loguear un usuario a la aplicacion
    Dado que estoy en el sitio web en la pestaña
    Cuando realice el Logueo en el sitio web
      |  Nombre    |  <Nombre>      |
      |  Contrasena|  <Contrasena>  |
    Entonces debo inciar sesion correctamente

    Ejemplos:
      | Nombre      | Contrasena|
      | Mateo       | 1996      |

  @IniciarSesionIncorrectamente
  Esquema del escenario: Loguear un usuario a la aplicacion
    Dado que estoy en el sitio web en la pestaña
    Cuando realice el Logueo en el sitio web
      |  Nombre    |  <Nombre>      |
      |  Contrasena|  <Contrasena>  |
    Entonces se debe visualizar un mensaje informando usuario o contraseña incorrecta

    Ejemplos:
      | Nombre      | Contrasena|
      | Mateo       | 0000      |
