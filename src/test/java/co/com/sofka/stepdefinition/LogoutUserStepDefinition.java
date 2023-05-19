package co.com.sofka.stepdefinition;

import co.com.sofka.questions.EliminarUsuario;
import co.com.sofka.questions.LogoutUser;
import co.com.sofka.task.EliminarUser;
import co.com.sofka.task.LogoutUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static co.com.sofka.stepdefinition.HooksApi.environmentVariables;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LogoutUserStepDefinition {


    @Cuando("realizo una petición post  para realizar el logout usuario")
    public void realizoUnaPeticiónPostParaRealizarElLogoutUsuario() {
        HooksApi.actor.attemptsTo(
                LogoutUsuario.call(environmentVariables.getProperty("api.postlogout"),"")

        );
    }
    @Entonces("recibo  el status")
    public void reciboElStatus() {
        HooksApi.actor.should(
                seeThat(LogoutUser.conStatusCode200()));
    }
}
