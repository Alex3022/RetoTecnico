package co.com.sofka.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LogoutUser implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Ensure.that(SerenityRest.lastResponse().statusCode()).isEqualTo(200)
        );
        return true;

    }

    public static LogoutUser  conStatusCode200() {
        return new LogoutUser ();
    }
}
