package co.com.sofka.questions;

import co.com.sofka.model.UserCreac;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CreacionUser implements Question<Boolean> {
    private final UserCreac body;

    public CreacionUser(UserCreac body) {
        this.body = body;

    }
    public static CreacionUser verifyWith(UserCreac body){
        return new CreacionUser(body);

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        UserCreac data = SerenityRest.lastResponse().as(UserCreac.class);
        actor.attemptsTo(
                Ensure.that(SerenityRest.lastResponse().statusCode()).isEqualTo(201),
                Ensure.that(SerenityRest.lastResponse().as(UserCreac.class).getId()).isNotNull(),
                Ensure.that(SerenityRest.lastResponse().as(UserCreac.class).getEmail()).isEqualTo(body.getEmail())

        );
        return true;
    }
}
