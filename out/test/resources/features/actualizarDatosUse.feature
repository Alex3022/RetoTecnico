#language: es

Característica: Actualizar datos del usuario

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario: Actualizar datos del usuario
    Cuando realizo una petición PUT para actualizar un usuario sin cuerpo en la solicitud
    Entonces la respuesta debe tener un código de estado 200