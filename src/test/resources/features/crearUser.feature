#language: es

Característica: Crear usuario

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario:Crear usuario
    Dado que quiero crear un usuario
    Cuando realizo una petición post  para realizar la creacion del user
    Entonces recibo la informacion del usuario creado