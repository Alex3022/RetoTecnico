package co.com.sofka.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class EliminarUsuario implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(SerenityRest.lastResponse().statusCode()).isEqualTo(204)
        );
        return true;
    }

    public static EliminarUsuario conStatusCode204() {
        return new EliminarUsuario();
    }

}
