package co.com.sofka.questions;

import co.com.sofka.model.RegistrarUsuarioRespuesta;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class RegistroUsuario implements Question<Boolean> {




    public static RegistroUsuario verifyWith()  {
        return new RegistroUsuario();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        RegistrarUsuarioRespuesta data = SerenityRest.lastResponse().as(RegistrarUsuarioRespuesta.class);
        actor.attemptsTo(
                Ensure.that(SerenityRest.lastResponse().statusCode()).isEqualTo(200),
                Ensure.that(SerenityRest.lastResponse().as(RegistrarUsuarioRespuesta.class).getId()).isNotNull(),
                Ensure.that(SerenityRest.lastResponse().as(RegistrarUsuarioRespuesta.class).getToken()).isNotNull());
        return true;
    }
}
