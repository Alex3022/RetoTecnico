#language: es

Característica: login usuario

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario:login usuario
    Dado solicito el login del usuario
    Cuando realizo una petición post  para realizar el login del user
    Entonces recibo  el token