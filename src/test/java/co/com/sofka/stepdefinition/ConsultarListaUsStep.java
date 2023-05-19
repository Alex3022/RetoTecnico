package co.com.sofka.stepdefinition;


import co.com.sofka.utils.DataManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import co.com.sofka.model.ListaUser;

import co.com.sofka.questions.ObtenerListaUser;
import co.com.sofka.task.ConsultarListaUser;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ConsultarListaUsStep {

    private ListaUser body;

    private HashMap<String, String> headers;

    @Cuando("realizo una petición get para consultar la lista de usuarios")
    public void realizoUnaPeticiónGetParaConsultarLaListaDeUsuarios() {
        System.out.println(HooksApi.environmentVariables.getProperty("api.get"));
        HooksApi.actor.attemptsTo(
                ConsultarListaUser.call(HooksApi.environmentVariables.getProperty("api.get"))
        );
    }
    @Entonces("recibo la lista de  los usuarios")
    public void reciboLaListaDeLosUsuarios() {
        body = DataManager.getDataListaUser();
        HooksApi.actor.should(
               seeThat(ObtenerListaUser.verifyWith(body), is(true))
        );
    }


}
