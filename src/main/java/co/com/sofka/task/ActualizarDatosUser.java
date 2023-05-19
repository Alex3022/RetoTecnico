package co.com.sofka.task;

import co.com.sofka.servicios.interactions.CallService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ActualizarDatosUser implements Task {

    private String endpoint;
    private String id;


    public ActualizarDatosUser(String endpoint, String id) {
        this.endpoint = endpoint;
        this.id = id;
    }

    public static ActualizarDatosUser call(String endpoint, String id) {
        return new ActualizarDatosUser(endpoint, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CallService.restPut(endpoint + id)
        );
    }
}
