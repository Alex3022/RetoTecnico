package co.com.sofka.task;

import co.com.sofka.model.RegistrarUsuarioRespuesta;
import co.com.sofka.model.RegistroUsuarioPeticion;
import co.com.sofka.servicios.interactions.CallService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

public class RegistrarUser implements Task {


    private final String resource;

    private final RegistroUsuarioPeticion body;

    private final Map<String, String> header;

    public RegistrarUser(String resource, RegistroUsuarioPeticion body, Map<String, String> header) {
        this.resource = resource;
        this.body = body;
        this.header = header;
    }

    public static  RegistrarUser call(String resource, RegistroUsuarioPeticion body, Map<String, String> header) {
        return new  RegistrarUser(resource, body, header);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        CallService.restPost(resource, body, header)
    );

    }
}
