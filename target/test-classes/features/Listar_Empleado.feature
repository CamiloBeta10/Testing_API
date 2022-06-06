# language:es

  Característica: Quiero consultar la lista de los empleados por medio de los  servicios

    Esquema del escenario: Consulto la lista de empleados
      Dado Camilo sube los datos para el servicio
      |nombre|salario|edad|codigoRespuesta|
      |<nombre>|<salario>|<edad>|<codigoRespuesta>|
      Cuando intento obtener la informacion de un empleado
      Entonces deberia ver al empleados

      Ejemplos:
        |nombre|salario|edad|codigoRespuesta|
        |Cedric Kelly |433060|22|200|
