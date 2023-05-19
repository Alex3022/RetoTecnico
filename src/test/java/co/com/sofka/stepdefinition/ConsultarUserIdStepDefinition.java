package co.com.sofka.stepdefinition;

import co.com.sofka.model.ConsultarRespuesta;
import co.com.sofka.questions.ObtenerUserID;
import co.com.sofka.task.ConsultarUserId;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static co.com.sofka.stepdefinition.HooksApi.actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ConsultarUserIdStepDefinition {




    @Cuando("realizo una petición get para consultar usuario por id")
    public void realizoUnaPeticiónGetParaConsultarUsuarioPorId() {

        HooksApi.actor.attemptsTo(
                ConsultarUserId.call(HooksApi.environmentVariables.getProperty("api.getconsultarusuario"))
        );
    }



    @Entonces("recibo la informacion del usuario")
    public void reciboLaInformacionDelUsuario() {

        actor.should(
                seeThat(ObtenerUserID.verifyWith(),is(true))
        );

    }
}
