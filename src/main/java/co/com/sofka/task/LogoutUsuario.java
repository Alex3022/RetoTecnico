package co.com.sofka.task;

import co.com.sofka.servicios.interactions.CallService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LogoutUsuario implements Task {
    private String resource;

    private String body;

    public LogoutUsuario(String resource, String body) {
        this.resource = resource;
        this.body = body;
    }
    public static LogoutUsuario call (String resource, String body){
        return new LogoutUsuario(resource, body);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CallService.restPost(resource,body)
        );

    }
}
