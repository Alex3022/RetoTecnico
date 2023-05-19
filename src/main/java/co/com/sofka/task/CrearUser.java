package co.com.sofka.task;

import co.com.sofka.model.UserCreac;
import co.com.sofka.servicios.interactions.CallService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

public class CrearUser implements Task {

    private final String resource;
     private  final UserCreac body;

    private final Map<String, String> header;

    public CrearUser(String resource, UserCreac body, Map<String, String> header) {
        this.resource = resource;
        this.body = body;
        this.header = header;

    }
    public static CrearUser call( String resource,UserCreac body,Map<String, String> header){
        return new CrearUser(resource, body, header);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CallService.restPost(resource, body, header)
        );

    }
}
