package co.com.sofka.questions;

import co.com.sofka.model.ListaUser;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ObtenerListaUser  implements  Question<Boolean> {
    private  final ListaUser  body;

    public ObtenerListaUser(ListaUser body) {
        this.body = body;
    }

    public static ObtenerListaUser verifyWith (ListaUser body){
        return new ObtenerListaUser(body);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        ListaUser data = SerenityRest.lastResponse().as(ListaUser.class);
        System.out.println(data);
        System.out.println(data.getPerPage());
        System.out.println(body.getPerPage());
        actor.attemptsTo(
                Ensure.that(data.getPerPage()).isEqualTo(body.getPerPage()),
                Ensure.that(data.getTotalPages()).isEqualTo(body.getTotalPages())
        );
        return true;
    }
}
