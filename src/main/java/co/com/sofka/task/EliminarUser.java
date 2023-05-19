package co.com.sofka.task;

import co.com.sofka.model.UserCreac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import java.util.Map;

public class EliminarUser implements Task {

    private String resource;
   public EliminarUser(String resource){
       this.resource = resource;
   }

    public static EliminarUser call(String resource) {
        return new EliminarUser(resource);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Delete.from(resource)
       );

    }
}
