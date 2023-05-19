package co.com.sofka.stepdefinition;

import co.com.sofka.model.UserCreac;
import co.com.sofka.questions.CreacionUser;
import co.com.sofka.task.CrearUser;
import co.com.sofka.utils.DataManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.util.HashMap;

import static co.com.sofka.stepdefinition.HooksApi.actor;
import static co.com.sofka.stepdefinition.HooksApi.environmentVariables;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CrearUserStepDefinition {
    private UserCreac body;
    private  HashMap<String, String> headers = new HashMap<>();

    @Dado("que quiero crear un usuario")
    public void queQuieroCrearUnUsuario() {
        body = DataManager.getDataUserCreac();
        headers.put("Content-Type","application/json") ;

    }
    @Cuando("realizo una petición post  para realizar la creacion del user")
    public void realizoUnaPeticiónPostParaRealizarLaCreacionDelUser() {
       actor.attemptsTo(
               CrearUser.call(environmentVariables.getProperty("api.postcrearusuario"),body,headers)
       );
    }
    @Entonces("recibo la informacion del usuario creado")
    public void reciboLaInformacionDelUsuarioCreado() {
    actor.should(
            seeThat(CreacionUser.verifyWith(body),is(true))
    );
    }

}