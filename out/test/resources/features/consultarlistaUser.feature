#language: es

Característica: Consultar lista de usuarios

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario: Consultar lista de usuarios
    Cuando realizo una petición get para consultar la lista de usuarios
    Entonces recibo la lista de  los usuarios