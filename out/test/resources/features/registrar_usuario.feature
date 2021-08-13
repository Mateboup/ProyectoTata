#language: es

Característica: Validar que un usuario se pueda registrar en el sitio web
  Yo como usuario de product Store
  deseo poder registrarme en la en el sitio web
  para poder ingresar al sitio web.

  Antecedentes:
    Dado que "Mateo" esta en el sitio web

  @RegistrarDuplicado
  Esquema del escenario: Registrar un usuario a la aplicacion
    Cuando realice el registro en el sitio web en la pestaña registro
      |  Nombre    |  <Nombre>      |
      |  Contrasena|  <Contrasena>  |
      |  Pestana   |  <Pestana>     |
    Entonces se debe visualizar un mensaje informando duplicidad

    Ejemplos:
      | Nombre      | Contrasena| Pestana |
      | Mateo       | 1996      | Sign up |

  @RegistrarExitosamente
  Esquema del escenario: Registrar un usuario a la aplicacion
    Cuando realice el registro en el sitio web en la pestaña registro
      |  Nombre    |  <Nombre>      |
      |  Contrasena|  <Contrasena>  |
      |  Pestana   |  <Pestana>     |
    Entonces el registro debe ser exitoso

    Ejemplos:
      | Nombre      | Contrasena| Pestana|
      | Mateo       | 1996      |Sign up |
