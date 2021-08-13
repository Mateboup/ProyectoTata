#language: es

Característica: Validar que un usuario se pueda adicionar producto al carrito
  Yo usuario de product Store
  deseo poder adicionar un producto en el sitio web
  para poder comprar los productos
  @InicarSesionCorrectamente
  Esquema del escenario: Adicionar productos al carrito
    Dado que estoy en el sitio web en la pestaña
    Cuando seleccione un sección de articulos y luego un producto
    |Seccion  |<Seccion> |
    |Producto |<Producto>|
    Entonces debe permitir adicionar el producto

    Ejemplos:
      | Producto     |Seccion|
      | MacBook Pro  |Laptops |
