#language: es

  Característica: Eliminar  usuario

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario: Eliminar  usuario
    Cuando realizo una petición Delete para eliminar a usuario
    Entonces la respuesta debe tener un código de estado 204 aprobado
