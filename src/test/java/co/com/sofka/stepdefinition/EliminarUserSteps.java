package co.com.sofka.stepdefinition;

import co.com.sofka.servicios.interactions.CallService;
import co.com.sofka.task.EliminarUser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import co.com.sofka.questions.EliminarUsuario;


import static co.com.sofka.stepdefinition.HooksApi.environmentVariables;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class EliminarUserSteps {


    @Cuando("realizo una petición Delete para eliminar a usuario")
    public void realizoUnaPeticiónDeleteParaEliminarAUsuario() {
         HooksApi.actor.attemptsTo(
                 EliminarUser.call(environmentVariables.getProperty("api.delete"))

         );


    }
    @Entonces("la respuesta debe tener un código de estado {int} aprobado")
    public void laRespuestaDebeTenerUnCódigoDeEstadoAprobado(Integer int1) {
        HooksApi.actor.should(
                seeThat(EliminarUsuario.conStatusCode204()));
    }
}
