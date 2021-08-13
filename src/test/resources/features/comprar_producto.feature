#language: es

Característica: Validar que un usuario se pueda adicionar producto al carrito
  Yo como usuario de product Store
  deseo poder adicionar un producto en el sitio web
  para poder comprar los productos

  Antecedentes:
    Dado que "Mateo" esta en el sitio web en la pestaña

  @InicarSesionCorrectamente
  Esquema del escenario: Adicionar productos al carrito

    Cuando seleccione un sección de articulos y luego un producto
    |Seccion  |<Seccion> |
    |Producto |<Producto>|
    Entonces debe permitir adicionar el producto

    Ejemplos:
      | Producto     |Seccion|
      | MacBook Pro  |Laptops|
