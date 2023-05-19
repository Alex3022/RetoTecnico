#language: es

Característica: Registrar Usuario

  Antecedentes:
    Dado  como "administrador" quiero usar la pagina  reqres api

  Escenario:Crear usuario
    Dado que registrar un usuario
    Cuando realizo una petición post  para realizar el registro del user
    Entonces recibo el id y el token