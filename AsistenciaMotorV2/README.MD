Práctica Taller
===============

Supuesto
--------

Partiendo de las clases `Coche`, `VehiculoConRuedas`, `Vehiculo`, etc... que se han ido viendo en las sesiones del curso Java JAZZ, se pide crear e implementar una Clase `Taller` que admita distintos tipos de vehículos particulares (coches, motos, etc...):
1. La clase de encargará de arreglar vehículos averiados. Puede ser que tengan varias averías distintas, las cuales normalmente llevarán asociado un presupuesto basado en el número de horas de mano de obra y las piezas de repuesto que necesite.
2. Cuando se ingrese un vehículo al taller para su reparación se debe dar la estimación de horas que llevará su reparación tras hacerle un diagnóstico y el presupuesto estimado.
3. El turno para reparar los vehículos los dará en primer lugar la existencia de piezas de repuesto para reparar todas las averías, después la fecha de entrada del vehículo al taller y finalmente el menor tiempo de reparación estimado.
4. La reparación tendrá una fecha de entrega del vehículo y tiene un periodo de garantía de un año. En caso de surgir la misma avería en menos de un año, el taller reparará dicha avería sin coste para el cliente a menos que en la diagnosis de detecte algún tipo de mal uso o fraude.

Si se ha realizado la práctica de `Tienda` se pueden utilizar también las clases de ese proyecto (`Cliente`, `Tienda`, etc...) para adaptarlas a este.
