# language:es

Característica: Quiero agregar un nuevo empleado por medio del Servicio

  Esquema del escenario: Creacion de empleado
    Dado Camilo sube los datos para el servicio
      |nombre|salario|edad|codigoRespuesta|
      |<nombre>|<salario>|<edad>|<codigoRespuesta>|
    Cuando intento agregar un nuevo empleado
    Entonces deberia ver al nuevo empleados creado

    Ejemplos:
      |nombre|salario|edad|codigoRespuesta|
      |Camilo Betancur|533060|27|200|
