#language: es

Característica: Consultar usuario por id

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario: Consultar usuario por id
    Cuando realizo una petición get para consultar usuario por id
    Entonces recibo la informacion del usuario