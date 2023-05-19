package co.com.sofka.questions;

import co.com.sofka.model.ConsultarRespuesta;
import co.com.sofka.model.RegistrarUsuarioRespuesta;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ObtenerUserID implements Question<Boolean> {


    public static ObtenerUserID verifyWith(){
        return new ObtenerUserID ();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        ConsultarRespuesta data =  SerenityRest.lastResponse().as(ConsultarRespuesta.class);
        actor.attemptsTo(
                Ensure.that(SerenityRest.lastResponse().statusCode()).isEqualTo(200)
                );




        return true;
    }
}
