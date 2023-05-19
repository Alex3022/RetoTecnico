package co.com.sofka.task;

import co.com.sofka.servicios.interactions.CallService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ConsultarUserId implements Task {

    private final String resource;

    public ConsultarUserId(String resource) {
        this.resource = resource;
    }

    public static ConsultarUserId call(String resource){
        return new ConsultarUserId (resource);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CallService.restGet(resource)
        );
    }

    }
