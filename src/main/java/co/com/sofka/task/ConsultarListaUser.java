package co.com.sofka.task;

import co.com.sofka.servicios.interactions.CallService;
import co.com.sofka.model.ListaUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

public class ConsultarListaUser implements Task {

  private final String resource;


    public ConsultarListaUser(String resource) {
        this.resource = resource;
    }

    public static ConsultarListaUser call(String resource){
        return new ConsultarListaUser(resource);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CallService.restGet(resource)
        );

    }
}
