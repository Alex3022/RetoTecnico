package co.com.sofka.stepdefinition;

import co.com.sofka.model.RegistrarUsuarioRespuesta;
import co.com.sofka.model.RegistroUsuarioPeticion;
import co.com.sofka.questions.RegistroUsuario;
import co.com.sofka.task.RegistrarUser;
import co.com.sofka.utils.DataManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.opentelemetry.sdk.logs.data.Body;

import java.util.HashMap;

import static co.com.sofka.stepdefinition.HooksApi.environmentVariables;
import static org.hamcrest.Matchers.is;

import static co.com.sofka.stepdefinition.HooksApi.actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistrarUserStepDefinition {

    private RegistroUsuarioPeticion body;
    private HashMap<String, String> headers = new HashMap<>();

    @Dado("que registrar un usuario")
    public void queRegistrarUnUsuario() {
        body = DataManager.getDataRegistroUsuarioPeticion();
        headers.put("Content-Type","application/json") ;

    }
    @Cuando("realizo una petición post  para realizar el registro del user")
    public void realizoUnaPeticiónPostParaRealizarElRegistroDelUser() {
       actor.attemptsTo(
               RegistrarUser.call(environmentVariables.getProperty("api.post"),body,headers)

       );
    }
    @Entonces("recibo el id y el token")
    public void reciboElIdYElToken() {
        actor.should(
                seeThat(RegistroUsuario.verifyWith(),is(true))
        );
    }
}
