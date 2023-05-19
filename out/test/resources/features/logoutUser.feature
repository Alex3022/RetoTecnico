#language: es

Característica: logout usuario

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario:logout usuario
    Cuando realizo una petición post  para realizar el logout usuario
    Entonces recibo  el status