# Examen Fundamentos Java

> NOTA: El tiempo para terminarlo no debería exceder de 2 horas para un junior. La solución se puede ver tanto descargando el proyecto completo comprimido en [solucion.rar](https://github.com/Awes0meM4n/codigoHijosDelSpectrum/raw/master/Java/evaluacion/fundamentos1/solucion.rar) como en el código dentro de la [carpeta solucion](https://github.com/Awes0meM4n/codigoHijosDelSpectrum/tree/master/Java/evaluacion/fundamentos1/solucion)

Vamos crear algunas partes del código de una aplicación de compras.

Los productos que se usarán para las pruebas son:

| ID (int) | Descripción - Marca                     | Precio (€) |
| -------- | --------------------------------------- | ---------- |
| 1        | 12 latas Refresco - Coca Cola           |   6,01     |
| 2        | Leche Semidesnatada 1 litro - President |   0,72     |
| 5        | Dentífrico - Oral B                     |   1,99     |
| 8        | 6 botellas 1,5 litro - Font Vella       |   2,99     |

El usuario en la versión final podrá ir añadiéndolos de un catálogo mayor, pero para la prueba se van a instanciar estos cuatro al inicio de la ejecución en el `main`.

Para poder realizar el examen es necesario usar el proyecto que se descarga desde [ExamenFundamentos1.rar](https://github.com/Awes0meM4n/codigoHijosDelSpectrum/raw/master/Java/evaluacion/fundamentos1/ExamenFundamentos1.rar).

**Los puntos evaluables, y ponderados con el valor entre paréntesis, son**:
* (2 puntos) Todos los tipos que implemente pertenecerán al paquete `com.acing` excepto el que contenga el `main` que estará en la clase `com.app.App`.
* (2) Crear una clase que sirva de carrito de la compra llamada `Carrito` donde se podrán consultar los productos cargados mediante el método `addProducto(T)`. Debe elegir y crear un tipo apropiado para `T`, **no se pide que sea genérico**. Este método devolverá `true` si se ha cargado y `false` si no. `App` debe tener una variable de instancia de tipo `Carrito` para controlar la compra.
* (3 un punto cada subapartado) Crear un tipo para manejar los datos de un producto teniendo en cuenta las siguientes consideraciones:
  * En un futuro se quiere poder trabajar con la marca del producto para filtrar datos o hacer descuentos.
  * El constructor de este tipo tendrá una sobrecarga con `id` y otra sin `id`, pero uno de ellos aprovechará el código del otro. También tendrá constructor por defecto y no podrán modificarse sus atributos.
  * El método `toString()` devolverá un texto como el de la tabla (Descripción - Marca).
* (1) Con la clase recién creada añada los dos primeros productos de pruebas al carrito de la compra.
* (8 contando los 6 de los subapartados) En un futuro se incorporarán servicios de distintos proveedores de productos y sus propias librerías para incorporar los productos suministrados. Estas librerías serán fáciles de utilizar con los tipos de nuestra aplicación y todos tendrán un método `getDescripcion()` y `getPrecio()`. Cree los tipos necesarios para tener esta flexibilidad que se pide y que no haya que modificar nuestro código ya implementado.
  * (2) Esos métodos servirán para que se pueda conocer el valor total del carrito con los productos escogidos. El método a utilizar se llamará `getValorCarrito()` que pertenecerá a la clase `Carrito`.
  * (3) `Carrito` tendrá otro método llamado `getInformeCarrito()` que:
    * Devolverá un `String` con un listado de los productos
      * Cada producto en una línea y con su precio
      * Ordenados por precio de menor a mayor
    * En la última línea el valor total con una tabulación al principio.
  * (1) Se añadirá otro de los productos y se comprobará que los retornos se actualizaron correctamente.
* (2) Compruebe que su diseño funciona con una librería externa incorporando la clase `com.examen.Product3rdParty` para añadir el producto `“Crime & Punishment”` con precio de `0,46€`.
* (1) Si no lo ha hecho ya, añada en `App` todos los productos a una `Collection` en una variable de clase inmutable y que sólo se vea en la clase `App`.
* (3) `App` tendrá un almacén con las siguientes existencias:
  * ID 1: 8
  * ID 2: 3
  * ID 5: 0
  * ID 8: 1
  * El control de existencias será implementado con `Arrays`, pero al tamaño del array se creará con los huecos necesarios para tener desde el ID 1 hasta el mayor que haya en la colección de productos del punto anterior sin **“magic numbers”**.
  * Para conseguir el máximo ID, haga un método privado, estático y genérico que devuelva el máximo ID en una `Collection<T>`, pasada como argumento, de un tipo `T` que sólo tenga un método: `getId()`.
* (2) `App` tendrá un método `addToCarrito(T)` que no permitirá añadir los productos sin existencias al carrito. `T` no puede ser del tipo `"Producto"` si no que será un tipo que implemente las interfaces necesarias hasta ahora para esta funcionalidad.
* (1) Mostrará el mensaje `“No hay existencias de [Producto]”` si no queda en el almacén. Si lo añade al carrito restará de las existencias y mostrará el mensaje `“Quedan X de [Producto]”` donde `X` es el número de existencias tras añadir el producto al carrito. En caso de no añadirse el producto se informará `"Ocurrió un error al añadir [Producto]"`.
