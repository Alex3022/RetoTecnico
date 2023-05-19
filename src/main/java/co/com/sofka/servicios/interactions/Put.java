package co.com.sofka.servicios.interactions;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class Put extends RestInteraction {
    private String resource;
    public Put(String resource) {
        this.resource = resource;

    }
    public static Put to(String resource) {
        return new Put(resource);
    }

    @Step("{0} executes a PUT on the resource #resource")
    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .when()
                .put(as(actor).resolve(resource));
    }
}
