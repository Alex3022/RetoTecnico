package co.com.sofka.stepdefinition;

import co.com.sofka.task.ActualizarDatosUser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import co.com.sofka.questions.InformacionConsultarUser;

import static co.com.sofka.stepdefinition.HooksApi.actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ActualizarDatosUserStepDefinition {

    @Cuando("realizo una petición PUT para actualizar un usuario sin cuerpo en la solicitud")
    public void realizoUnaPeticiónPUTParaActualizarUnUsuarioSinCuerpoEnLaSolicitud() {
        String resource = "api/users/";
        actor.attemptsTo(
                ActualizarDatosUser.call(resource,"1")
        );

    }

    @Entonces("la respuesta debe tener un código de estado {int}")
    public void laRespuestaDebeTenerUnCódigoDeEstado(Integer int1) {

        actor.should(
                seeThat(InformacionConsultarUser.conStatusCode200(), is(true)));


    }
}
