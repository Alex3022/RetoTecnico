package co.com.sofka.stepdefinition;

import co.com.sofka.model.RegistroUsuarioPeticion;
import co.com.sofka.questions.LoginUsuario;
import co.com.sofka.questions.RegistroUsuario;
import co.com.sofka.task.RegistrarUser;
import co.com.sofka.utils.DataManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.util.HashMap;

import static co.com.sofka.stepdefinition.HooksApi.actor;
import static co.com.sofka.stepdefinition.HooksApi.environmentVariables;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LoginUserStepDefinition {

    private RegistroUsuarioPeticion body;
    private HashMap<String, String> headers = new HashMap<>();

    @Dado("solicito el login del usuario")
    public void solicitoElLoginDelUsuario() {
        body = DataManager.getDataRegistroUsuarioPeticion();
        headers.put("Content-Type","application/json") ;
    }
    @Cuando("realizo una petición post  para realizar el login del user")
    public void realizoUnaPeticiónPostParaRealizarElLoginDelUser() {
        actor.attemptsTo(
                RegistrarUser.call(environmentVariables.getProperty("api.postlogin"),body,headers)

        );
    }
    @Entonces("recibo  el token")
    public void reciboElToken() {
        actor.should(
                seeThat(LoginUsuario.verifyWith(),is(true))
        );
    }
}
